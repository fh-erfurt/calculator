# Building the App with Maven
FROM maven:3-jdk-8-alpine

ADD . /calculator
WORKDIR /calculator

# Just echo so we can see, if everything is there :)
RUN ls -l

# Run Maven build
RUN mvn clean install