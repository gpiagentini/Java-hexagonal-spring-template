# Spring Boot Hexagonal Architecture Template

This is a template project for Spring Boot applications designed using **Hexagonal Architecture** (Ports and Adapters). It helps you structure your codebase to be maintainable, scalable, and flexible, following Domain-Driven Design (DDD) principles. This template provides clear separation of concerns between different layers, ensuring that your business logic is not tightly coupled to any framework or infrastructure.

## Project Overview

- **Framework**: Spring Boot 3.x
- **Java Version**: 17
- **Build Tool**: Maven
- **Architecture**: Hexagonal Architecture (Ports & Adapters)

## Penencies
- Implement Full CRUD
- Implement Http Request/Responses
- Implement Error treatment
- Implement Kafka Topics (Another Branch)
- Se default values

## Project Structure

```text
src/
 └── main/
     ├── java/
     │   └── br/com/gpiagentini/api/
     │       ├── application/           # Application layer (use cases)
     │       │   ├── service/           # Application services
     │       │   └── port/              # Input and output ports (interfaces)
     │       ├── domain/                # Domain layer (core business logic)
     │       ├── infrastructure/        # Infrastructure layer (adapters, controllers, etc.)
     │       │   ├── adapters/          # Controllers, persistence adapters, etc.
     │       │   └── persistence/       # Repositories and data mappers
     └── resources/
         ├── application.yml            # Spring Boot configuration
