# JDBC connection pooling
## Introduction to Database Connection Pools
- A database connection pool is a container that is responsible for allocating
    and managing database connections (Connection objects).
- It allows applications to reuse existing database connections instead of creating a new connection for every request.
- Connections that remain idle longer than the configured maximum idle time are automatically released,
  preventing database connection leaks caused by unreleased connections.

- Benefits:
  - Resource reuse
  - Improved application performance
  - Prevention of database connection leaks


### Standard Interface: DataSource

- DataSource is the standard interface for database connection pools provided by Sun (now Oracle).
- Third-party libraries implement this interface.
- Primary function: Obtain a database connection.
> Connection getConnection()

### Common Database Connection Pool Implementations
- DBCP
- C3P0
- Druid

### Druid (Alibaba)
- Druid is an open-source database connection pool developed by Alibaba.
- It provides powerful features and excellent performance.
- It is considered one of the most popular and high-performance database connection pools in the Java ecosystem.

### Steps to use Druid
- Import the Druid JAR file (druid-1.1.12.jar)
- Create a configuration file
- Load the configuration file
- Obtain the database connection pool object
- Get a database connection

