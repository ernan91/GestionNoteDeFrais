package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Connect {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DBNAME = "notedefrais";
    private static final String URL = "jdbc:mysql://localhost/"+DBNAME+"?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Connect instance;

    private Connect() {
        try {
            Class.forName(DRIVER).newInstance();
            System.out.println("*** Driver loaded. ***");
        }
        catch (ClassNotFoundException e) {
            System.err.println("*** ERROR: Driver " + DRIVER + " non trouvé ***");
        }
        catch (InstantiationException e) {
            System.err.println("*** ERROR: Impossible to create an instance of " + "org.apache.derby.jdbc.ClientDriver");
            System.err.println(e.getMessage());
        }
        catch (IllegalAccessException e) {
            System.err.println("*** ERROR: Impossible to create an instance of " + "org.apache.derby.jdbc.ClientDriver");
            System.err.println(e.getMessage());
        }
    }
// 
    public static Connect getInstance() {
        if (instance == null) {
            instance = new Connect();
        }
        return instance;
    }

    public static String getDBNAME() {
        return DBNAME;
    }

    
    public static Connection getConnection() throws SQLException {
    	
    	// $conn  = new PDO(,,,) 
        Connection cx = DriverManager.getConnection(URL, USER, PASSWORD);
        return cx;
    }

    public void close(final Connection cx) {
        if (cx != null) {
            try {
                cx.close();
            }
            catch (SQLException e) {
                // très rare a priori donc pas de throws
                System.err.println("Impossible to close connection");
                System.err.println(e.getMessage());
            }
        }
    }

    public void close(final Statement st) {
        if (st != null) {
            try {
                st.close();
            }
            catch (SQLException e) {
                System.err.println("Impossible to close statement");
                System.err.println(e.getMessage());
            }
        }
    }

    public void close(final ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            }
            catch (SQLException e) {
                System.err.println("Impossible to close resultSet");
                System.err.println(e.getMessage());
            }
        }
    }
}

