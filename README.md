# 🚜 Kissan Assistant – Farmer Management REST API

A Spring Boot-based RESTful API to manage farmer (Kissan) records, including full CRUD operations, partial updates, and input validation. Built using Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL.

## 🔧 Tech Stack

- Java 17+
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate ORM
- MySQL
- Maven
- ModelMapper
- Lombok
- Postman (for testing)

## 📦 Features

- Add new farmer records
- Retrieve all or single farmer by ID
- Update full farmer details (`PUT`)
- Partially update farmer data (`PATCH`)
- Delete farmer record
- Input validation using DTOs
- Entity-DTO conversion using `ModelMapper`

## 📁 API Endpoints

| Method | Endpoint            | Description                  |
|--------|---------------------|------------------------------|
| GET    | `/Kissans`          | Get all farmers              |
| GET    | `/Kissans/{id}`     | Get farmer by ID             |
| POST   | `/Kissans`          | Create a new farmer          |
| PUT    | `/Kissans/{id}`     | Full update of farmer        |
| PATCH  | `/Kissans/{id}`     | Partial update of farmer     |
| DELETE | `/Kissans/{id}`     | Delete a farmer record       |

## 📑 Data Model (Entity)

```java
Long id;
Integer code;
String name;
Float weight;
LocalDate toWeighDate;

📌 How to Run
1.Clone the repository

2.Configure your MySQL database in application.properties

3.Run the project using Eclipse or IntelliJ

4.Test endpoints via Postman

🧪 Sample JSON for Creating Farmer

{
  "code": 101,
  "name": "Ramesh",
  "weight": 62.5,
  "toWeighDate": "2025-08-08"
}

📚 Learning Highlights
Implemented full CRUD functionality using JpaRepository

Used DTOs and @Valid annotations for clean request validation

Applied ModelMapper for seamless entity-DTO conversion

Followed a layered architecture: Controller → Service → Repository

🤝 Author
Ritik Rajput

Aspiring Java Backend Developer

📧 [RitikRajput302@gmail.com]

🔗 [LinkedIn/GitHub URL if available]
