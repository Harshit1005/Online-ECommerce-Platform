# 🛒 Online E-Commerce Platform (Java Web Application)
The Online E-Commerce Platform is a Java-based web application developed using JSP, Servlets, JDBC, and Apache Tomcat.
The project follows the MVC (Model–View–Controller) architecture and supports role-based authentication for different users such as Admin, Seller, and User.

This project is designed for academic submission and demonstrates core Java web development concepts including servlet handling, database connectivity, and dynamic web pages.

## Features :-
User Authentication (Login)

Role-based Dashboard Redirection

Admin Dashboard

Seller Dashboard

User Dashboard

Add Products (Seller/Admin)

View Products

Add Users (Admin)

View Users (Admin)

Delete Users / Products

Server-side Validation

MVC Architecture Implementation

## Project Architecture (MVC)
Model → Java Beans & Entity Classes

View → JSP pages (UI)

Controller → Servlets

DAO Layer → Database operations using JDBC

## Technologies Used
Java (JDK 8+)

JSP & Servlets

JDBC

Apache Tomcat 9

HTML, CSS

MySQL Database

Eclipse IDE

# PROJECT STRUCTURE
OnlineEcommercePlatform
│
├── src/main/java
│   ├── controller
│   │   ├── LoginServlet.java
│   │   ├── AddUserServlet.java
│   │   ├── AddProductServlet.java
│   │   ├── ViewProductServlet.java
│   │   └── DeleteUserServlet.java
│   │
│   ├── dao
│   │   ├── UserDAO.java
│   │   └── ProductDAO.java
│   │
│   ├── model
│   │   ├── User.java
│   │   └── Product.java
│   │
│   └── util
│       └── DBConnection.java
│
├── src/main/webapp
│   ├── jsp
│   │   ├── login.jsp
│   │   ├── adminDashboard.jsp
│   │   ├── sellerDashboard.jsp
│   │   ├── userDashboard.jsp
│   │   ├── addUser.jsp
│   │   ├── addProduct.jsp
│   │   ├── viewUsers.jsp
│   │   └── viewProducts.jsp
│   │
│   ├── css
│   ├── js
│   └── WEB-INF
│       └── web.xml
│
└── README.md

# USER ROLE
| Role   | Access                  |
| ------ | ----------------------- |
| Admin  | Manage users & products |
| Seller | Add & view products     |
| User   | View products           |

#  Database Setup
CREATE DATABASE ecommerce;

USE ecommerce;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100),
    role VARCHAR(20)
);

CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    price DOUBLE,
    quantity INT
);

# Run the Application
Import project into Eclipse

Configure Apache Tomcat 9

Right-click project → Run on Server

Open browser:
http://localhost:8081/OnlineEcommercePlatform/jsp/login.jsp

# Login Credentials
Admin:
Email: admin@gmail.com
Password: admin123

Seller:
Email: seller@gmail.com
Password: seller123

# Future Enhancements

Session management & logout

Password encryption

Filters for role-based access

Shopping cart functionality

Payment gateway integration





