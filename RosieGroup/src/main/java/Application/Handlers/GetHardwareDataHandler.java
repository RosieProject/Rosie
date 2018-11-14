package Application.Handlers;

import Application.Handlers.Get.GetComputerData;
import Application.Handlers.Get.GetCpuData;
import Application.Handlers.Get.GetDiskData;
import Application.Handlers.Get.GetMemoryData;
import Application.Models.Computer;

public class GetHardwareDataHandler {

    public GetHardwareDataHandler(){
        getOshiCpuData();
        getOshiMemory();
        getOshiDiskData();

        if(Computer.getFamily() == null) {
            getComputerData();
        }
    }

    public void getOshiCpuData(){
        new GetCpuData();
    }

    public void getOshiMemory(){
        new GetMemoryData();
    }

    public void getOshiDiskData(){
        new GetDiskData();
    }

    public void getComputerData(){
        new GetComputerData();
    }
}
