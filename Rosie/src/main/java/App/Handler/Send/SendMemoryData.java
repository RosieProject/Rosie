package App.Handler.Send;

import App.Commons.SendDataCommon;
import App.Models.Memory;
import Infrastructure.MicrosoftJDBC.Repositories.HardwareDataRepository;

import javax.sql.DataSource;
import java.sql.*;

public class SendMemoryData implements SendDataCommon {
    final private Memory _memory;
    private DataSource _dataSource;
    private Connection connection;

    public SendMemoryData(Memory memory,
                       DataSource dataSource)
    {
        _memory = memory;
        _dataSource = dataSource;
    }

    @Override
    public void Send() {
        String update = new HardwareDataRepository().getInsertMemoryUpdate(_memory.getMemoryUsage());

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
