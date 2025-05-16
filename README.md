# Spring Boot User Management Demo

## Overview
A simple Spring Boot project demonstrating basic architecture, annotations, dependency injection, and in-memory user management with REST API endpoints. This project simulates a user management system using a fake repository to store users.

## Technologies Used
- Java 17
- Spring Boot 2.7.x
- JUnit 5 for testing
- Maven/Gradle for dependency management

## Project Structure


## Key Features
- **User Model**: Represents a user with `id`, `name`, and `surname` properties.
- **FakeRepo**: A fake repository simulating an in-memory database using a list.
- **User Service**: Implements logic to add, remove, and retrieve users via the fake repository.
- **REST API Controller**: Exposes endpoints to interact with users.
  - `POST /users`: Adds a new user.
  - `GET /users/{id}`: Retrieves a user by their ID.
  - `DELETE /users/{id}`: Deletes a user by their ID.

## How to Run the Project
1. Clone the repository:
   ```bash
https://github.com/Katlego-Ram2/spring-boot-user-demo
