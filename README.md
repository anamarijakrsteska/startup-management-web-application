# Startup Management Web Application
A Spring Boot web application for managing startups.

## Features

* Display startups with pagination
* Add new startups
* Edit startup details
* Delete startups
* Deactivate active startups
* Search and filter startups by:
  * Name
  * Valuation
  * Year of establishment
  * Industry
  * Founder
* Admin authentication and authorization
* Role-based visibility of management buttons
* Thymeleaf-based web interface

## Technologies

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* Spring Security
* Thymeleaf
* Maven
* H2 / relational database

## Project Structure

* `model` — Startup and Founder entities
* `repository` — JPA repositories
* `service` — Business logic
* `service.impl` — Service implementations
* `web/controller` — HTTP request handling
* `config` — Security and application configuration
* `templates` — Thymeleaf pages

## Main Routes

* `/` — Startup list
* `/startups` — Startup list with filtering and pagination
* `/startups/add` — Add startup
* `/startups/edit/{id}` — Edit startup
* `/startups/delete/{id}` - Delete startup
* `/startups/deactivate/{id}` - Deactivate startup
* `/login` — Login
* `/logout` — Logout

## Security

The startup list is publicly accessible. Management operations are restricted to users with the `admin` role. The **Edit**, **Delete**, **Add new startup**, and **Deactivate** buttons are displayed only to authorized administrators.

## Testing

The project includes Selenium tests for the implemented functionality, including CRUD operations, pagination, filtering, and security.
