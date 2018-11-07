package Infrastructure.MicrosoftJDBC.Repositories;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HardwareDataRepository {

    public String getInsertCpuUpdate(double data) {
        DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return String.format(Locale.US, "INSERT INTO CpuData (Usage_Cpu, Horario) VALUES (%f,'%s')", data, dateformat.format(date));
    }
    
    public String getInsertMemoryUpdate(long data) {
        DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return String.format(Locale.US, "INSERT INTO MemoryData (Usage_Memoria, Horario) VALUES (%d,'%s')", data, dateformat.format(date));
    }
    
        public String getInsertDiskUpdate(long data) {
        DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return String.format(Locale.US, "INSERT INTO DiskData (Usage_Disk, Horario) VALUES (%d,'%s')", data, dateformat.format(date));
    }
}

