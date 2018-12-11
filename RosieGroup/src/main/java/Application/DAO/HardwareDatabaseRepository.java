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

    public String insertCpuUpdate(int idPc, String name, double usage, long upTime, int logical, int physical) {
        return String.format(Locale.US, "INSERT INTO CpuData (ID_PC, Name_Cpu,"
                + " Usage_Cpu, UpTime_Cpu, LogicalProcessor_Cpu,"
                + " PhysicalProcessor_Cpu, Horario) "
                + "VALUES\n"
                + "(%d, '%s', %f, %d, %d, %d, '%s')",
                idPc, name, usage, upTime, logical, physical,
                _dateFormat.format(_date));
    }

    public String insertMemoryUpdate(int idPc, long total, long usable) {
        return String.format(Locale.US, "INSERT INTO MemoryData "
                + "(ID_PC, Total_Memory, Usable_Memory, Horario) VALUES\n"
                + "(%s, %s, %s, '%s')", idPc, total, usable, _dateFormat.format(_date));
    }

    public String insertDiskUpdate(int idPc, long total, long usable) {
        return String.format(Locale.US, "INSERT INTO DiskData (ID_PC, Total_Disk, Usable_Disk, Horario) VALUES\n"
                + "(%d, %d, %d, '%s')",
                idPc,
                total,
                usable,
                _dateFormat.format(_date));
    }

    public String insertOSUpdate(int idPc, String family, int bitness, String version, int process, int thread, String manufacturer) {
        return String.format(Locale.US, "INSERT INTO OSData (ID_PC, OS_Family, "
                + "Bitness_OS, Version_OS, ProcessCount_OS, ThreadCount_OS, "
                + "Manufacturer_OS, Horario) "
                + "VALUES\n"
                + "(%s, '%s', %s, '%s', %s, %s, '%s', '%s')",
                idPc,
                family,
                bitness,
                version,
                process,
                thread,
                manufacturer,
                _dateFormat.format(_date));
    }
}
