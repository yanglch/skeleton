FROM maven:3.6.3-openjdk-11
ADD / /skeleton/
COPY settings.xml /usr/share/maven/ref/
WORKDIR /skeleton
RUN mvn install -s /usr/share/maven/ref/settings.xml clean package -Prdc-private-repo -DskipTests
RUN mvn -f /skeleton/app/bootstrap/pom.xml -s /usr/share/maven/ref/settings.xml clean package -Prdc-private-repo -DskipTests
RUN mvn -f /skeleton/pom.xml -s /usr/share/maven/ref/settings.xml clean deploy -Prdc-private-repo -DskipTests

FROM openjdk:11-slim-0800
COPY --from=0 /skeleton/app/bootstrap/target/skeleton-bootstrap-*.jar /skeleton/skeleton-bootstrap.jar
WORKDIR /skeleton
EXPOSE 80
ENTRYPOINT ["java", "-jar", "skeleton-bootstrap.jar"]



#FROM alpine
#RUN cd /usr/local &&\
#    wget https://download.java.net/openjdk/jdk11/ri/openjdk-11+28_linux-x64_bin.tar.gz &&\
#    tar -xzvf openjdk-11\+28_linux-x64_bin.tar.gz &&\
#    rm -f openjdk-11\+28_linux-x64_bin.tar.gz &&\
#    ln -s jdk-11/bin/java /usr/bin/java