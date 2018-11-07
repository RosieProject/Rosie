package App.Handler.Get;

import App.Commons.GetDataCommon;
import App.Models.Disk;
import oshi.SystemInfo;
import oshi.software.os.OSFileStore;

public class GetDiskData implements GetDataCommon{
private Disk _disk;

public GetDiskData(Disk disk){
    _disk = disk;
}
    
    @Override
    public Disk get() {
     OSFileStore[] fileStores = new SystemInfo().getOperatingSystem().getFileSystem().getFileStores();
     long total = fileStores[0].getTotalSpace() + fileStores[1].getTotalSpace();
     long usavel = fileStores[0].getUsableSpace()+ fileStores[1].getUsableSpace();   
     _disk.setDiskUsage(total - usavel);
     return _disk;
    }
    
}
