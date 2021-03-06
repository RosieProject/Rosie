package Application.Handlers.Send;

import Application.DAO.DatabaseConnection;
import Application.DAO.HardwareDatabaseRepository;
import Application.Interfaces.ISendData;
import Application.Models.Disk;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SendDiskData implements ISendData {
    private int idPc;
    public SendDiskData(int idPc){
        this.idPc = idPc;
        try{
            SendData(idPc);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void SendData(int idPc) throws SQLException {
        String update = new HardwareDatabaseRepository().insertDiskUpdate(
                idPc,
                Disk.getDiskTotal(),
                Disk.getDiskAvailable());

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
