# Our base image that contains OpenJDK
FROM openjdk
# Add the fatjar in the image
COPY target/gs-rest-service-0.1.0.jar /
# Default command
CMD java -jar /gs-rest-service-0.1.0.jar