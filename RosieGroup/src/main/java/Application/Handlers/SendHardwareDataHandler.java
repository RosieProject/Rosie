package Application.Handlers;

import Application.Handlers.Send.SendComputerData;
import Application.Handlers.Send.SendCpuData;
import Application.Handlers.Send.SendDiskData;
import Application.Handlers.Send.SendMemoryData;
import Application.Models.Computer;

public class SendHardwareDataHandler {

    public SendHardwareDataHandler(){
        sendOshiCpuData();
        sendOshiMemoryData();
        sendOshiDiskData();

        if(Computer.getFamily() == null) {
            sendOshiComputerData();
        }
    }

    public void sendOshiCpuData(){
        new SendCpuData();
    }

    public void sendOshiMemoryData(){
        new SendMemoryData();
    }

    public void sendOshiDiskData(){
        new SendDiskData();
    }
    
    public void sendOshiComputerData(){
       new SendComputerData();
    }
}
