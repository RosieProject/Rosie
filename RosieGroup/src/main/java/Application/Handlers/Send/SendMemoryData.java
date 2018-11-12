package Application.Handlers.Send;

import Application.DAO.DatabaseConnection;
import Application.DAO.HardwareDatabaseRepository;
import Application.Interfaces.ISendData;
import Application.Models.Memory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SendMemoryData implements ISendData {

    public SendMemoryData(){
        try{
            SendData();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void SendData() throws SQLException {
        String update = new HardwareDatabaseRepository().insertMemoryUpdate(Memory.getMemoryTotal() - Memory.getMemoryAvailable());

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
