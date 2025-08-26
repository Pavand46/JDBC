# JDBC
JDBC CRUD

This project demonstrates basic JDBC operations in Java using PostgreSQL.

It includes separate files for:

Insert → InsertData.java

Update → UpdateData.java

Delete → DeleteData.java

⚙️ Prerequisites

Install PostgreSQL.

Download and add PostgreSQL JDBC driver.

Create a database and a sample table:

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    marks INT
);

▶️ How to Run

Compile all files:

javac *.java


Run any operation:

java InsertData
java ReadData
java UpdateData
java DeleteData

🔑 Database Configuration

Update DBConfig.java with your DB credentials:

private static final String URL = "jdbc:postgresql://localhost:5432/jdbcdemo";
private static final String USER = "postgres";
private static final String PASS = "your_password";
