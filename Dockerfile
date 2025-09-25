FROM public.ecr.aws/docker/library/openjdk:17
COPY target/consumer1-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
