package App.Handler;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;

public class ComputerHardwareHandler {
    final private SystemInfo _systemInfo;
    
    public ComputerHardwareHandler(){
        _systemInfo = new SystemInfo();
    }
    
    public CentralProcessor getCentralProcessor(){
        return _systemInfo.getHardware().getProcessor();
    }
    
    public GlobalMemory getGlobalMemory(){
        return _systemInfo.getHardware().getMemory();
    }
    
    public HWDiskStore[] getDiskStores(){
        return _systemInfo.getHardware().getDiskStores();
    }
    
}
