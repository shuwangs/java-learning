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


### ResultSet 
- functions: 
  1. boolen next(): if the current line is valid
     - true:
     - false
  2. XXX getXXX(params): 
    - e.g., int getInt(params), String getString(params)
      - params: int (column number, start from 1)
        - String: the column name
    

## PreparedStatement
An object that represents a precompiled SQL statement. 
A SQL is precompiled and stored in a PreparedStatement
- PreparedStatement function:
  -   
- SQL injection

### Steps
1. Define sql
> example: String sql =  "select * from user where useername =? and password = ?"
2. get preparedStatement obj
> PreparedStatement pst = conn.preparedStatement(sql);

3. Set params
> assign ? values

4. execute sql
