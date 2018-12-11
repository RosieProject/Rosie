package Application.Handlers.Get;

import Application.Interfaces.IGetData;
import Application.Models.Disk;
import oshi.software.os.OSFileStore;

public class GetDiskData implements IGetData {
    private OSFileStore[] fileStores;

    public GetDiskData(){
        fileStores = Disk.getFileStores();
        GetData();
    }
    public void GetData() {
        Disk.setDiskTotal(fileStores[0].getTotalSpace());
        Disk.setDiskAvailable(fileStores[0].getUsableSpace());
        Disk.setName(fileStores[0].getName());
    }
}
