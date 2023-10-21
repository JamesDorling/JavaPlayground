package core.jdbc.control.db_management.sql_queries;

import core.jdbc.config.JDBCConfig;

public interface EmployeeSQL {
    String ADD_EMPLOYEE = "insert into employees (`employeeID`, `first_name`, `last_name`) values (?,?,?)";
    // ` can be \" from the looks of things

    String GET_ALL_EMPLOYEES = "select * from employees";
}
