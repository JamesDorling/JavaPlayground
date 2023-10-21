package core.jdbc.control.db_management.sql_queries;

import core.jdbc.config.JDBCConfig;

public interface DbInitialiseStatements {
    String DB_INITIALISE = "create database if not exists " + JDBCConfig.dbDatabaseName();
    String DB_INITIALISE_EMPLOYEES_TABLE = "create table if not exists employees(" +
            "employeeID integer," +
            "first_name varchar(20)," +
            "last_name varchar(20))";
}
