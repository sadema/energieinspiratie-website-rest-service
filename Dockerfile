ARG BUILD_IMAGE=maven:3.6-jdk-11
ARG RUNTIME_IMAGE=openjdk:11-jdk-slim

FROM ${BUILD_IMAGE} as dependencies

COPY pom.xml ./

RUN mvn -B dependency:go-offline

FROM dependencies as build

COPY src ./src

RUN mvn -B clean package

FROM ${RUNTIME_IMAGE}

COPY --from=build target/website-rest-service-*.jar /opt/app/website-rest-service.jar

WORKDIR /opt/app/
CMD ["java", "-jar", "website-rest-service.jar"]
