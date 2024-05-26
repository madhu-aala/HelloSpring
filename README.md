# HelloSpringApplication

This project demonstrates a simple Spring Boot application that prints "Hello Spring!" to the console.

## Project Structure

The project consists of two main files:

1. `HelloSpringApplication.java`
2. `Hello.java`

### HelloSpringApplication.java

This is the main entry point of the Spring Boot application. It initializes the Spring context and retrieves the `Hello` bean to call its `sayHello` method.

### Hello.java
This is a simple Spring component with a method sayHello that prints "Hello Spring!" to the console.

## How to Run:
To run this application, you need to have Java and Maven installed on your system. Follow these steps:

### 1. Clone the repository:

```
git clone https://github.com/your-username/hello-spring-application.git
cd hello-spring-application
```

### 2. Build the project using Maven:

```
mvn clean install
```

### 3. Run the application:

```
mvn spring-boot:run
```

## You should see the following output in the console:

```
Hello Spring!
```

## Prerequisites:
- Java 8 or higher
- Maven 3.6.0 or higher

## Project Dependencies:
This project uses Spring Boot. The dependencies are managed by Maven, and the relevant dependencies can be found in the `pom.xml` file.

## Contributing:
Contributions are welcome! Please create a pull request with a detailed description of your changes.
