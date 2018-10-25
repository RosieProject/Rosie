package App.Controller;

import oshi.hardware.platform.windows.WindowsGlobalMemory;

public class MemoryController {
    
    private WindowsGlobalMemory _globalMemory = new WindowsGlobalMemory();
    private long _memoryUsage;
    
    public WindowsGlobalMemory getGlobalMemory(){
        return _globalMemory;
    }
    
    public long getMemoryUsage(){
        /*long memoryAvailable = _globalMemory.getAvailable();
        long memoryTotal = _globalMemory.getTotal();
        */
        return _memoryUsage;
    }
    
}
