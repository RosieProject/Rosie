package Application.Handlers.Send;

import Application.DAO.DatabaseConnection;
import Application.DAO.HardwareDatabaseRepository;
import Application.Interfaces.ISendData;
import Application.Models.Disk;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SendDiskData implements ISendData {

    public SendDiskData(){
        try{
            SendData();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void SendData() throws SQLException {
        String update = new HardwareDatabaseRepository().insertDiskUpdate(Disk.getDiskTotal() - Disk.getDiskAvailable());

        Connection connection = DatabaseConnection.getConnection();
        try {
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
