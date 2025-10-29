FROM gcr.io/distroless/java21-debian12

WORKDIR /app

COPY what-is-two-plus-three.jar /app/what-is-two-plus-three.jar

RUN gradle clean build -x test

FROM gcr.io/distroless/java21-debian12

WORKDIR /app

COPY --from=build /app/build/libs/*.jar app.jar

CMD ["app.jar"]