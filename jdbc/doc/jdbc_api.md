## Driver Manager
- DataSource interface, provides another way to connect a data source
- register the driver
- get connection with db

### important methods
- registerDriver()
- getConnection() 
> static Connection  getCoonection(String url, String user, String passwrod)

## Connection
- is connection with a specific database
- SQL statements are executed and results are returned within the context of a connection

- Transaction management:
  - setAutoCommit 
  - commit()


## Statement
- int --- executeUpdate: DML, DDL
> return value: for DML: affected lines count
    for DDL: may return 0;
- ResultSet --- executeQuery: DQL
> Return value: ResultSet is the set of the results