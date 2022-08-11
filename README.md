# 🎬 Cinema-Service 🎥
This is simple simulator of cinema service for reservation tickets, that supports registration, authentication and CRUD operations.
___

## 💫 Features: 💫
* register or login as user or as admin
* create and find movies
* create and find available movie sessions
* create and find cinema halls
* creating shopping cart
* add tickets to shopping cart
* complete an order
---

### ✅ Endpoints on which you can check operations:
```java
        [POST]   /register - registers a new user
        [GET]    /users/by-email - returns user by email
        [PUT]    /shopping-carts/movie-sessions - adds a movie session to shopping cart
        [GET]    /shopping-carts/by-user - returns shopping cart of logged user
        [POST]   /orders/complete - completes an order
        [GET]    /orders - returns order history of user
        [POST]   /cinema-halls - creates a new cinema hall
        [GET]    /cinema-halls - returns all cinema halls
        [GET]    /movie-sessions/available - returns all available movie sessions for the selected movie
        [PUT]    /movie-sessions/{id} - updates a movie session
        [DELETE] /movie-sessions/{id} - deletes a movie session
        [POST]   /movies - creates a new movie
        [GET]    /movies - returns all movies
        [POST]   /movie-sessions - creates a new movie session
```
---

## 🛠️ Project architecture:
The Cinema-Service is based on 3-layer architecture:
1. Controllers, which handle requests, call services and send responses
2. Services - there are all business logic
3. DAO, which handle CRUD operations to database

### Model structure
![pic](Hibernate_Cinema_Uml.png)
---

## 🧬 Technologies used in project:
* Java 11
* MySql 8.0.29
* Hibernate 5.6.8
* Spring Core 
* Spring MVC 
* Spring Security
* Maven
* Tomcat
---

## ⏯ To run this project:
* Clone this project
* Install and configure MySQL and Apache Tomcat v 9.0.64
* Setup database parameters in resources/db.properties
* Run project with Tomcat
* After that you will be able to login as admin with next credentials: 
          ```email: admin@i.ua 
             password: 1234```
* To register new user send POST request to [http://localhost:8080/register](http://localhost:8080/register) with email, password and repeatPassword.
          