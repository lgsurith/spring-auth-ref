# SpringBoot JWT Authentication
This Repository is used for references in the sector of JWT Security.

## Setup
### Pre-Requisites : 
* Java version - 17
* Spring Boot Packages
* Maven 3.6 or higher.
* Sql Workbench

### Spring Dependencies :
* Spring Boot Starters
* JSON Web Token
* Spring Security
* Spring Configuration Processor
* Spring Boot Test

## Installation
* Clone the Repository
  ```bash
  git clone https://github.com/lgsurith/spring-auth-ref.git
  cd spring-auth-ref
  ```
  
* Configure MySql Database in ```application.properties```
  
  ```bash
  spring.application.name=authapi
  spring.datasource.url = jdbc:mysql://localhost:3306/employee_auth
  spring.datasource.username = username
  spring.datasource.password= password
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
  ```
  
* Build the Project
  ```bash
  mvn clean install
  ```
  
* Run the Springboot Application
  ```bash
  mvn spring-boot:run
  ```

  The Application will start in ```http://localhost:8080```

## API Endpoints

| Endpoint           | Description                                                                                  |
|--------------------|----------------------------------------------------------------------------------------------|
| `/api/auth/signup` | Initial user signup without authentication.                                                  |
| `/api/auth/login`  | Obtain the token while logging in, which will be used for authentication by passing it in the bearer token. |
| `/api/user/me`     | Gets the particular user's information after authentication.                                  |
| `/api/user/`       | Gets all the users from the database.                                                        |

  
## Video Walkthrough : 
https://github.com/lgsurith/spring-auth-ref/assets/117572209/d4515065-f0a4-4998-8a27-7488c0211eff

