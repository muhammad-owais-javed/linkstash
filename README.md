# LinkStash API

A simple RESTful API built with Java and Spring Boot to save, retrieve, and manage hyperlinks.

---

## Features

This API provides CRUD (Create, Read, Update, Delete) functionality for link resources.

*   **Create a Link:** `POST /links`
*   **Retrieve All Links:** `GET /links`
*   **Retrieve a Single Link:** `GET /links/{id}`
*   **Update a Link:** `PUT /links/{id}`
*   **Delete a Link:** `DELETE /links/{id}`

---

## Technologies Used

*   **Java 17:** The core programming language.
*   **Spring Boot 3:** The application framework, providing web server and dependency injection capabilities.
*   **Spring Data JPA:** For abstracting data persistence and repository logic.
*   **H2 Database:** An in-memory relational database used for development and testing.
*   **Maven:** A build automation and dependency management tool.

---

## API Endpoints

### 1. Create a Link

*   **Method:** `POST`
*   **URL:** `/links`
*   **Request Body:**
    ```json
    {
      "title": "Spring Boot Documentation",
      "url": "https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/"
    }
    ```
*   **Success Response:** `200 OK` with the created link object in the body.

### 2. Get All Links

*   **Method:** `GET`
*   **URL:** `/links`
*   **Success Response:** `200 OK` with a JSON array of all link objects.

### 3. Get a Single Link

*   **Method:** `GET`
*   **URL:** `/links/{id}`
*   **Success Response:** `200 OK` with the requested link object.
*   **Error Response:** `404 Not Found` if the ID does not exist.

### 4. Update a Link

*   **Method:** `PUT`
*   **URL:** `/links/{id}`
*   **Request Body:**
    ```json
    {
      "title": "Updated Title",
      "url": "https://updated-url.com"
    }
    ```
*   **Success Response:** `200 OK` with the updated link object.
*   **Error Response:** `404 Not Found` if the ID does not exist.

### 5. Delete a Link

*   **Method:** `DELETE`
*   **URL:** `/links/{id}`
*   **Success Response:** `204 No Content`.
*   **Error Response:** `404 Not Found` if the ID does not exist.

---

## How to Run the Project

1.  **Prerequisites:**
    *   JDK 17 (or newer )
    *   Apache Maven
2.  **Clone the repository:**
    ```bash
    git clone https://github.com/muhammad-owais-javed/system-monitor-cli.git
    ```
3.  **Navigate to the project directory:**
    ```bash
    cd linkstash
    ```
4.  **Build and run the application using Maven:**
    ```bash
    ./mvnw spring-boot:run
    ```
5.  The API will be available at `http://localhost:8080`.

