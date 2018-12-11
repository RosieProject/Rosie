package Application;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.software.os.OSFileStore;
import oshi.software.os.OperatingSystem;

public class ComputerInformation {
    private static final SystemInfo computerInfo = new SystemInfo();

    public CentralProcessor getCentralProcessor(){
        return computerInfo.getHardware().getProcessor();
    }

    public GlobalMemory getGlobalMemory() {
        return computerInfo.getHardware().getMemory();
    }

    public OSFileStore[] getFileStores() {
        return computerInfo.getOperatingSystem().getFileSystem().getFileStores();
    }
    
   public OperatingSystem getOperatingSystem(){
       return computerInfo.getOperatingSystem();
   }
   
}
