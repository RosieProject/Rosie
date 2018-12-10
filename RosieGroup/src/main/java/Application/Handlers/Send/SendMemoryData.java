package Application.Handlers.Send;

import Application.DAO.DatabaseConnection;
import Application.DAO.HardwareDatabaseRepository;
import Application.Interfaces.ISendData;
import Application.Models.Memory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SendMemoryData implements ISendData {
    private int idPc;
    public SendMemoryData(int idPc){
        this.idPc = idPc;
        try{
            SendData(idPc);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void SendData(int idPc) throws SQLException {
        String update = new HardwareDatabaseRepository().insertMemoryUpdate(
                idPc,
                Memory.getMemoryTotal(),
                Memory.getMemoryAvailable());

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
