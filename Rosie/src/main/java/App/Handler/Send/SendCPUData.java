package App.Handler.Send;

import App.Commons.SendDataCommon;
import App.Models.Cpu;
import Infrastructure.MicrosoftJDBC.Repositories.HardwareDataRepository;

import javax.sql.DataSource;
import java.sql.*;

public class SendCPUData implements SendDataCommon{
    final private Cpu _cpu;
    private DataSource _dataSource;
    private Connection connection;

    public SendCPUData(Cpu cpu,
        DataSource dataSource)
    {
        _cpu = cpu;
        _dataSource = dataSource;
    }

    public void Send(){
        String update = new HardwareDataRepository().getInsertCpuQuery(_cpu.getCpuUsage());

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
