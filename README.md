# **IDAM-Google**

## **Overview**

**IDAM-Google** is a Spring Boot application demonstrating the integration of Google APIs for user authentication using the **OpenID Connect (OIDC)** protocol. This project showcases how to implement **OAuth2** for secure authentication, enabling users to log in with their Google accounts. It serves as an example for developers looking to integrate modern authentication mechanisms like OIDC into their Spring Boot applications.

This project is ideal for developers and learners aiming to explore Google API integration and understand OIDC/OAuth2-based authentication workflows.

## **Key Features**
- **OIDC Authentication**: Secure user authentication with Google using the OAuth2/OpenID Connect protocol.
- **Spring Boot Integration**: Shows how to set up a Spring Boot app with Google API integration.
- **Modern Security**: Implements OAuth2/OIDC for secure authentication.

## **Why Use This Project?**

This project is perfect for:
- **New Learners**: Provides a hands-on introduction to integrating Google authentication with Spring Boot.
- **Developers**: Offers insights into handling authentication securely in Spring Boot apps using Google’s OIDC system.
- **Hands-On Exploration**: Understand the flow from setting up Google OAuth2 to authenticating users with Google accounts.

## **Prerequisites**

Before starting, ensure that you have the following:
- **OpenJDK 21** installed on your machine.
- **Gradle** installed for project build and dependency management.
- A **Google Cloud Project** with **OIDC** (OAuth2) set up for user authentication.

## **Getting Started**

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-repo/idam-google.git
   cd idam-google
   ```

2. **Configure Google OAuth2**:
   - Set up an OAuth2 client in your Google Cloud project and configure the necessary credentials in your Spring Boot application (using application properties, environment variables, or secret management).

3. **Build and Run the Application**:
   - To build and run the application, use the following command:
     ```bash
     ./gradlew bootRun
     ```

4. **Access the Application**:
   - Once the application is running, visit `http://localhost:8080`.
   - Users will be prompted to log in using their Google account via OIDC.

## **Google Cloud Setup**

To use this project, you need to:
1. Create a project on [Google Cloud](https://console.cloud.google.com/).
2. Set up **OAuth2** credentials and configure the OAuth consent screen.
3. Configure **redirect URIs** in your Google project to point to your application.

## **Technologies Used**
- **OpenJDK 21**: The Java runtime environment used in this project.
- **Spring Boot**: For building the backend application.
- **Google OAuth2**: For user authentication using OpenID Connect.
- **OAuth2/OIDC**: To handle user authentication and secure access to resources.
- **Gradle**: For project build and dependency management.

