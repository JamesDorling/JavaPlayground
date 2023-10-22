package core.jdbc.control.db_management;


import core.jdbc.control.db_management.sql_queries.DbInitialiseStatements;

import java.sql.Connection;
import java.sql.SQLException;

public class DbInitialiser {
    private static void initialiseDB() {
        try {
            Connection connection = ConnectionManager.dbInitialiseConnection();
            connection.createStatement().executeUpdate(DbInitialiseStatements.DB_INITIALISE);
            ConnectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void initialiseEmployeesTable() {
        try {
            Connection connection = ConnectionManager.dbCompanyXConnection();
            connection.createStatement().executeUpdate(DbInitialiseStatements.DB_INITIALISE_EMPLOYEES_TABLE);
            ConnectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void initialiseDBInstance() {
        DbInitialiser.initialiseDB();
        DbInitialiser.initialiseEmployeesTable();
    }

    public static void main(String[] args) {
        DbInitialiser.initialiseDBInstance();
    }
}
