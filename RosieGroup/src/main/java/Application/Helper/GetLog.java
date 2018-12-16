package Application.Helper;

import Application.Models.Computer;
import Application.Models.Cpu;
import Application.Models.Disk;
import Application.Models.Memory;
//import java.text.DateFormat;
import java.util.Date;
import Application.Models.Sensors;
import java.text.SimpleDateFormat;
//import java.util.Calendar;

public class GetLog {
    public String getLog(){
        
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        
        String log = "===================================" + System.getProperty("line.separator") +
                "Date and time of capture:" + sdf.format(new Date()) +  System.getProperty("line.separator") +
                Computer.ComputerLogResponse() + Cpu.CpuLogResponse() + Disk.diskLogResponse() + Memory.memoryLogResponse() + Sensors.sensorLogResponse();
        return log;
    }
    
    
}
