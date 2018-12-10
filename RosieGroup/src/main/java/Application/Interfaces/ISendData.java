package Application.Interfaces;

import java.sql.SQLException;

public interface ISendData {
    void SendData(int idPc) throws SQLException;
}
