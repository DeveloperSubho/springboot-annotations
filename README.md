# springboot-annotations
Project on the implementation of Springboot annotations

Explanation of Spring Annotations Used:
1. @SpringBootApplication: This annotation is used to mark the main class of a Spring Boot application. It combines @Configuration, @EnableAutoConfiguration, and @ComponentScan annotations with their default attributes.

2. @Configuration: Indicates that the class can be used by the Spring IoC container as a source of bean definitions.

3. @ComponentScan: Configures component scanning directives for use with @Configuration classes.

4. @Bean: Indicates that a method produces a bean to be managed by the Spring container.

5. @RestController: A convenience annotation that combines @Controller and @ResponseBody. It eliminates the need to annotate every request handling method of the controller class with the @ResponseBody annotation.

6. @RequestMapping: Used to map web requests to specific handler classes or handler methods.

7. @GetMapping, @PostMapping, @PutMapping, @DeleteMapping: Shortcuts for @RequestMapping (method = RequestMethod.GET/POST/PUT/DELETE).

8. @PathVariable: Indicates that a method parameter should be bound to a URI template variable.

9. @RequestBody: Indicates that a method parameter should be bound to the body of the web request.

10. @Autowired: Marks a constructor, field, setter method, or config method to be autowired by Spring's dependency injection facilities.

11. @Entity: Specifies that the class is an entity and is mapped to a database table.

12. @Id: Specifies the primary key of an entity.

13. @GeneratedValue: Provides the specification of generation strategies for the primary keys.

14. @Repository: Indicates that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.

15. @Service: Indicates that an annotated class is a "Service", originally defined by Domain-Driven Design (Evans, 2003) as "an operation offered as an interface that stands alone in the model, with no encapsulated state."

16. @Transactional: Indicates that the annotated method or class should be executed within a transaction context.

This example provides a comprehensive overview of various Spring annotations and demonstrates how they are used to create a simple CRUD application with Spring Boot.

---

Access the H2 Console: If you want to view the H2 database, navigate to http://localhost:8080/h2-console. Use the following credentials:

JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: password