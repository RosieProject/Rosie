package Application.Handlers.Get;

import Application.Interfaces.IGetData;
import Application.Models.Memory;
import oshi.hardware.GlobalMemory;

public class GetMemoryData implements IGetData {
    private GlobalMemory globalMemory;

    public GetMemoryData(){
        globalMemory = Memory.getGlobalMemory();
        GetData();
    }

    public void GetData() {
        Memory.setMemoryTotal(globalMemory.getTotal());
        Memory.setMemoryAvailable(globalMemory.getAvailable());
        
    }
}
