# National Disaster Monitoring and Analysis System (NDMAS)

## Overview

The National Disaster Monitoring and Analysis System (NDMAS) is a platform designed to monitor, report, and analyze flood and natural disaster occurrences. It provides timely alerts and detailed insights to government agencies, emergency responders, and communities at risk, enhancing preparedness, response, and recovery efforts.

## Technologies Used

- Java
- PostgreSQL
- Hibernate (ORM for database interaction)
- Remote Method Invocation (RMI) for remote services

## Project Structure

```plaintext
.
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   ├── ndma
│   │   │   │   │   ├── model
│   │   │   │   │   ├── dao
│   │   │   │   │   ├── utils
│   │   │   │   │   └── service
│   │   │   │   │       └── implementation
│   │   └── |
│   │       └── hibernate.cfg.xml
└── README.md
```

# Getting Started

## Prerequisites

- JDK 8 or later
- PostgreSQL database

## Setting Up the Database

1. Install PostgreSQL.
2. Create a database named `ndma_db`.
3. Create a user named `boubou` with password `bouboune#123`.
4. Grant all privileges on the `ndma_db` database to the `boubou` user.

## Configuration

Configure the database connection in the `HibernateUtil` class located at `src/main/java/com/ndma/utils/HibernateUtil.java`:

```plaintext

Properties settings = new Properties();
settings.put(Environment.DRIVER, "org.postgresql.Driver");
settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/ndma_db");
settings.put(Environment.USER, "username");
settings.put(Environment.PASS, "password");
settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
settings.put(Environment.SHOW_SQL, "true");
settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
settings.put(Environment.HBM2DDL_AUTO, "update");
```
# Building and Running the Project

1. Compile the Java source files using your preferred IDE or `javac`.
2. Ensure your PostgreSQL server is running.
3. Run the main class or set up a web server if applicable.

## Project Modules

### Model

Entity classes representing the database tables.

- `DisasterEvent`
- `Report`
- `Role`
- `Responder`
- `DataSource`
- `UserProfile`

### DAO (Data Access Object)

Classes for CRUD operations on entities.

- `DisasterEventDao`
- `ReportDao`
- `RoleDao`
- `ResponderDao`
- `DataSourceDao`
- `UserDao`

### Service Interfaces

Remote service interfaces for RMI.

- `DisasterEventService`
- `ReportService`
- `RoleService`
- `ResponderService`
- `DataSourceService`
- `UserProfileService`

### Service Implementations

Implementation of service interfaces.

- `DisasterEventServiceImpl`
- `ReportServiceImpl`
- `RoleServiceImpl`
- `ResponderServiceImpl`
- `DataSourceServiceImpl`
- `UserProfileServiceImpl`

### Utils

Utility classes for Hibernate configuration.

- `HibernateUtil`

## Contributing

1. Fork the repository.
2. Create a new feature branch (`git checkout -b feature/new-feature`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature/new-feature`).
5. Open a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
