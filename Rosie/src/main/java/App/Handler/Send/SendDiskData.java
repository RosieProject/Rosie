package App.Handler.Send;

import App.Commons.SendDataCommon;
import App.Models.Disk;
import Infrastructure.MicrosoftJDBC.Repositories.HardwareDataRepository;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

public class SendDiskData implements SendDataCommon{
    final private Disk _disk;
    private DataSource _dataSource;
    private Connection connection;
    
    public SendDiskData(Disk disk,
        DataSource dataSource)
    {
        _disk = disk;
        _dataSource = dataSource;
    }

    @Override
    public void Send() {
        String update = new HardwareDataRepository().getInsertDiskUpdate(_disk.getDiskUsage());

        try {
            connection = _dataSource.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(update);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
}
