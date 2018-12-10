package Application.Handlers;

import Application.Handlers.Send.SendComputerData;
import Application.Handlers.Send.SendCpuData;
import Application.Handlers.Send.SendDiskData;
import Application.Handlers.Send.SendMemoryData;
import Application.Models.Computer;

public class SendHardwareDataHandler {
    private int idPc;
    public SendHardwareDataHandler(int idPc){
        this.idPc = idPc;
        sendOshiCpuData();
        sendOshiMemoryData();
        sendOshiDiskData();

        if(Computer.getFamily() == null) {
            sendOshiComputerData();
        }
    }

    public void sendOshiCpuData(){
        new SendCpuData(idPc);
    }

    public void sendOshiMemoryData(){
        new SendMemoryData(idPc);
    }

    public void sendOshiDiskData(){
        new SendDiskData(idPc);
    }
    
    public void sendOshiComputerData(){
       new SendComputerData();
    }
}
