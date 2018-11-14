/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application.Handlers.Send;

import Application.Interfaces.ISendData;
import java.sql.SQLException;

/**
 *
 * @author andre
 */
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
