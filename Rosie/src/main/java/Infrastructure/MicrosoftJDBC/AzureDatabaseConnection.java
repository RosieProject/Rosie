package Infrastructure.MicrosoftJDBC;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

public class AzureDatabaseConnection {
    final static private String URL =  "jdbc:sqlserver://rosienoc.database.windows.net:1433;database=rosiedb;user=rosieadmin@rosienoc;password=@PI2rosie;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";


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

    public AzureDatabaseConnection(){
    }
}
