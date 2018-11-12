package Application.Handlers;

import Application.Handlers.Get.GetCpuData;
import Application.Handlers.Get.GetDiskData;
import Application.Handlers.Get.GetMemoryData;

public class GetHardwareDataHandler {

    public GetHardwareDataHandler(){
        getOshiCpuData();
        getOshiMemory();
        getOshiDiskData();
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
}
