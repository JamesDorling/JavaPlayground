package core.jdbc.control.db_management;

import core.jdbc.config.JDBCConfig;
import core.jdbc.control.db_management.sql_queries.EmployeeSQL;

import java.sql.*;

public class ConnectionManager {
    public static Connection dbInitialiseConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(JDBCConfig.dbDatabaseConnectionURL(), JDBCConfig.dbUsername(), JDBCConfig.dbPassword());
            System.out.println("Connected!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static Connection dbCompanyXConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(JDBCConfig.dbDatabaseConnectionURL() + "/" + JDBCConfig.dbDatabaseName(), JDBCConfig.dbUsername(), JDBCConfig.dbPassword());
            System.out.println("Connected again to set up employee table!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void closeConnection(Connection connection) {
        try {
            connection.close();
            System.out.println("Connection closed");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // NASTYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY
    //public static void addToDatabase(Connection connection, String[] employeeData) {
    //    connection = dbCompanyXConnection();
    //    try {
    //        connection.createStatement().executeQuery("insert into employee (" + employeeData[0] + ",\"" +
    //                employeeData[1] + "\",\"" + employeeData[2] + "\")");
    //        ConnectionManager.closeConnection(connection);
    //    } catch (SQLException e) {
    //        e.printStackTrace();
    //    }
    //}

    public static void addToDatabasePreparedStatement(Connection connection, String[] employeeData) {
        connection = dbCompanyXConnection();
        try {
            PreparedStatement employeePreppedStatement = ConnectionManager.dbCompanyXConnection().prepareStatement(EmployeeSQL.ADD_EMPLOYEE);
            employeePreppedStatement.setInt(1, Integer.parseInt(employeeData[0]));
            employeePreppedStatement.setString(2, employeeData[1]);
            employeePreppedStatement.setString(3, employeeData[2]);
            employeePreppedStatement.execute();
            ConnectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getAllEmployees() {
        try {
            ResultSet results = ConnectionManager.dbCompanyXConnection().createStatement().executeQuery(EmployeeSQL.GET_ALL_EMPLOYEES);
            while(results.next()) {
                System.out.println(results.getString(1));
                System.out.println(results.getString(2));
                System.out.println(results.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
