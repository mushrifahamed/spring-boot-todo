# Spring Boot To-Do List Application

A simple To-Do List application built using **Spring Boot** with basic CRUD functionality.

## Features
- Add a new task
- Mark a task as completed
- Delete a task
- View all tasks

## Prerequisites
Ensure you have the following installed before setting up the project:
- **Java 17 or later**
- **Maven**
- **IntelliJ IDEA (or any IDE of choice)**
- **Git**

## Setup Instructions
### 1. Clone the Repository
```sh
git clone https://github.com/mushrifahamed/spring-boot-todo.git
cd spring-boot-todo
```

### 2. Open the Project in IntelliJ IDEA
- Open IntelliJ IDEA
- Click **File > Open**
- Select the cloned `spring-boot-todo` folder
- Wait for Maven to import dependencies

### 3. Build and Run the Application
Use the following command to run the Spring Boot application:
```sh
mvn spring-boot:run
```
Or, if using IntelliJ:
- Navigate to `com.example.todoapp.TodoappApplication`
- Click **Run** (or press `Shift + F10`)

### 4. API Endpoints
You can test the API using **Postman** or **cURL**.

#### Add a Task
```sh
POST http://localhost:8080/tasks
Content-Type: application/json

{
  "title": "Complete Spring Boot Project",
  "completed": false
}
```

#### Get All Tasks
```sh
GET http://localhost:8080/tasks
```

#### Mark a Task as Completed
```sh
PUT http://localhost:8080/tasks/{id}/complete
```

#### Delete a Task
```sh
DELETE http://localhost:8080/tasks/{id}
```

### 5. Running the Application on a Different Port (Optional)
If port 8080 is in use, modify `src/main/resources/application.properties`:
```properties
server.port=9090
```
Then restart the application.

### 6. Stopping the Application
Press **CTRL + C** in the terminal to stop the application.

## License
This project is open-source and free to use.
