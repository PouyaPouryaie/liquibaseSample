# Liquibase Sample
how use liquibase with spring and maven plugin

## Getting Started
### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#using-boot-devtools)
* [Liquibase Migration](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#howto-execute-liquibase-database-migrations-on-startup)

### Guides
The following guides illustrate how to use some features concretely: <br>
two path for use liquibase <br>
- use maven plugin
- use spring

### preCondition
- create database and add config to application.properties

### maven plugin

* create db.changelog-master.yaml for define changeSet
* mvn liquibase:update command for update db with changeSet
* mvn liquibase:rollback -Dliquibase.rollbackCount=1 <br> for rollback with count from last
* mvn liquibase:rollback -Dliquibase.rollbackTag=version_1.3 <br> for rollback after specific tag

### spring

* add follow properties at application.properties 
'''spring.liquibase.change-log=classpath:db.changelog-master.yaml <br>
spring.liquibase.enabled=false'''
  
* run project