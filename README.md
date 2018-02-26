# spring-kafka-microservice
This is a repository for building a Spring Boot microservice using NetflixOSS and Apache Kafka. 

Read the complete blog here - https://crunchytechbytz.wordpress.com/2018/02/09/microservice-with-apache-kafka-netflix-oss/

#### Prerequisite
- Java 1.8
- Kafka
- docker 

#### Service Registry (Eureka)
- Build/Run
  - mvn clean install
  - java –jar target/EurekaServer-0.0.1-SNAPSHOT.jar
- Check
  - http://localhost:8761/
  
#### Config Server
  - Update properties 
    - SET **search-paths & git-url** in /spring-kafka-microservice/ConfigServer/src/main/resources/application.yml
    - SET **USERNAME** in spring-kafka-microservice/EmailServiceConfigProperties/email-service/dev/email-service.yml
    - SET **PASSWORD** in spring-kafka-microservice/EmailServiceConfigProperties/email-service/dev/email-service.yml
  - Build/Run
    - mvn clean install
    - java –jar target/ConfigServer-0.0.1-SNAPSHOT.jar
- Check
    - http://localhost:8888/email-service/dev

#### User Service
- Run
  - mvn clean install
  - java -jar target/UserAccount-0.0.1-SNAPSHOT.jar
- Check
  - http://localhost:8081/member -- expect 0 records returned

#### Email service
- Run
  - mvn clean install
  - java -jar target/EmailService-0.0.1-SNAPSHOT.jar
  
#### Test Microservice
Once each micro service is setup and started correctly, you can test the complete flow by
1. Create a new user by calling url – POST http://localhost:8081/register
2. Verify that the new user is created.
3. You can also verify the user by calling – GET http://localhost:8081/member 
4. Verify that registration success email was received at your email address

#### Deploying micro service in docker container
The same microservice can also be  deployed in docker containers and I have published a blog on same here -
https://crunchytechbytz.wordpress.com/2018/02/25/deploy-a-spring-boot-microservice-with-netflix-oss-stack-in-docker-container/

Simialry, if someone needs to refer to any help on installing Apache Kafka in docker container then they can refer here -
https://crunchytechbytz.wordpress.com/2018/01/28/install-apache-kafka-in-docker-container/
