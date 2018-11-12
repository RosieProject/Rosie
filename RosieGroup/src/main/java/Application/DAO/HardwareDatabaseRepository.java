package Application.DAO;

import Application.Helper.DateFormater;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class HardwareDatabaseRepository {
    private static HardwareDatabaseRepository ourInstance = new HardwareDatabaseRepository();
    private static DateFormat _dateFormat;
    private static Date _date;

    public HardwareDatabaseRepository() {
        _dateFormat = DateFormater.dateformat;
        _date = new DateFormater().getDate();
    }

    public String insertCpuUpdate(double data) {
        return String.format(Locale.US, "INSERT INTO CpuData (Usage_Cpu, Horario) VALUES (%f,'%s')", data, _dateFormat.format(_date));
    }

    public String insertMemoryUpdate(long data) {
        return String.format(Locale.US, "INSERT INTO MemoryData (Usage_Memoria, Horario) VALUES (%d,'%s')", data, _dateFormat.format(_date));
    }

    public String insertDiskUpdate(long data) {
        return String.format(Locale.US, "INSERT INTO DiskData (Usage_Disk, Horario) VALUES (%d,'%s')", data, _dateFormat.format(_date));
    }
}
