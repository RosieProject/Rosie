package App.Controller;

import oshi.hardware.platform.windows.WindowsGlobalMemory;



public class Memory {
    
    private WindowsGlobalMemory _globalMemory = new WindowsGlobalMemory();
    
    public WindowsGlobalMemory getGlobalMemory(){
        return _globalMemory;
    }
    
    public long getMemoryUsage(){
        long memoryAvailable = _globalMemory.getAvailable();
        long memoryTotal = _globalMemory.getTotal();
        
        return memoryTotal - memoryAvailable;
    }
    
}
