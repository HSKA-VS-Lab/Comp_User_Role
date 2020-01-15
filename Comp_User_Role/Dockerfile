FROM openjdk:8-jdk-alpine
ADD target/Comp_User_Role-*.jar compuserrole.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar", "compuserrole.jar"]