package Application.Handlers.Send;

import Application.DAO.DatabaseConnection;
import Application.DAO.HardwareDatabaseRepository;
import Application.Interfaces.ISendData;
import Application.Models.Computer;
import Application.Models.Cpu;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SendComputerData implements ISendData {
    private int idPc;
    public SendComputerData(int idPc){
        this.idPc = idPc;
        try{
            SendData(idPc);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void SendData(int idPc) throws SQLException {
        String update = new HardwareDatabaseRepository().insertOSUpdate(
                idPc,
                Computer.getFamily(),
                Computer.getBitness(),
                Computer.getVersion(),
                Computer.getProcessCount(),
                Computer.getThreadCount(),
                Computer.getManufacturer());

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
