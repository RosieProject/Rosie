package App.Controller;

import App.Commons.ControllerCommon;
import App.Handler.Get.GetDiskData;
import App.Handler.Send.SendDiskData;
import App.Models.Disk;
import javax.sql.DataSource;

public class DiskController implements ControllerCommon{
    private Disk _disk;
    
    public DiskController(Disk disk){
        _disk = disk;
    }
    
    @Override
    public Disk getHandler() {
        _disk = new GetDiskData(_disk).get();
        
        return _disk;
    }

    @Override
    public void sendHandler(DataSource dataSource) {
        new SendDiskData(_disk, dataSource).Send();
    }
   
}
