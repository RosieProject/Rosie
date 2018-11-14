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
    
    public SendComputerData(){
        try{
            SendData();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void SendData() throws SQLException {
        String update = new HardwareDatabaseRepository().insertOSUpdate(Computer.getBitness(), Computer.getFamily());

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
