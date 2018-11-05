package App.Models;

import oshi.SystemInfo;
import oshi.software.os.OSFileStore;

public class Disk extends Hardware{
    private OSFileStore[] fileStores;
    private long diskUsage;
    
    public void setDiskUsage(long diskUsage){
        this.diskUsage = diskUsage;
    }
    
    public long getDiskUsage(){
        return diskUsage;
    }
    
    public void setOsFileStore(){
        this.fileStores = new SystemInfo().getOperatingSystem().getFileSystem().getFileStores();
    }
    
    public OSFileStore[] getOsFileStores(){
        return this.fileStores;
    }
    
}
