package Application.DAO;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnection {
    private final static String URL = "jdbc:sqlserver://rosienoc.database.windows.net:1433;database=rosiedb;user=rosieadmin@rosienoc;password=@PI2rosie;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";

    public static DataSource getDataSource()
    {
        BasicDataSource ds = new BasicDataSource();
        try {
            ds.setUrl(URL);
            ds.setMinIdle(5);
            ds.setMaxIdle(10);
            ds.setMaxOpenPreparedStatements(15);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ds;
    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }
}
