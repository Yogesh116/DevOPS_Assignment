FROM openjdk:17
ADD target/Devops_Assignment_Nagarro-0.0.1-SNAPSHOT.jar DevOPS_Assignment.jar
ENTRYPOINT ["java","-jar","/DevOPS_Assignment.jar"]