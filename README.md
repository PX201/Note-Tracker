# Note Tracker Web Application

This is a simple web application for tracking notes. It allows users to add, view, and delete notes.

## Technologies Used

- Java
- Servlets
- JSP (JavaServer Pages)
- Maven
- AWS (Amazon Web Services)

## Prerequisites

Before running this application, make sure you have the following installed:

- Java Development Kit (JDK) 17 or higher
- Apache Tomcat 10.1 or higher
- Maven

## Getting Started

To run the application locally, follow these steps:

1. Clone the repository:


2. Import the project into your Eclipse IDE.

3. Build the project and package it as a WAR file.

4. Deploy the WAR file to your local Apache Tomcat server.

5. Access the application using the URL: http://localhost:<tomcat-port>/<context-path>

## Deployment to AWS

To deploy the application to AWS, follow these steps:

1. Sign in to the AWS Management Console.

2. Choose the AWS service suitable for hosting your Java web application (e.g., Elastic Beanstalk).

3. Set up the AWS environment by creating an application and configuring the necessary settings.

4. Package your application as a WAR file using Maven.

5. Upload and deploy the WAR file to your AWS environment.

6. Access the deployed application using the provided URL.

For detailed instructions on deploying Java web applications to AWS, refer to the official AWS documentation.

## Dependencies

This project uses the following dependencies:

- javax.servlet.jsp:javax.servlet.jsp-api:2.3.3
- jakarta.servlet:jakarta.servlet-api:6.0.0
- junit:junit:4.11
- com.google.code.gson:gson:2.10.1
- jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api:2.0.0
- org.glassfish.web:jakarta.servlet.jsp.jstl:2.0.0


