FROM java:8-jre
MAINTAINER Shashank Rastogi <shaan.infy@gmail.com>

ADD ./target/EurekaServer-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/EurekaServer-0.0.1-SNAPSHOT.jar"]

HEALTHCHECK --interval=10s --timeout=5s CMD curl -f http://192.168.99.100:8761/health || exit 1

EXPOSE 8761