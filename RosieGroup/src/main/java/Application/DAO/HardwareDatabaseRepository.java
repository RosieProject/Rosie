package Application.DAO;

import Application.Helper.DateFormater;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class HardwareDatabaseRepository {
    private static HardwareDatabaseRepository ourInstance = new HardwareDatabaseRepository();
    private static DateFormat _dateFormat;
    private static Date _date;
    private static final int TESTEPC = 4;

    public HardwareDatabaseRepository() {
        _dateFormat = DateFormater.dateformat;
        _date = new DateFormater().getDate();
    }

    public String insertCpuUpdate(double data, String nome) {
        return String.format(Locale.US, "INSERT INTO CpuData (Usage_Cpu, Horario,ID_PC, Name_CPU ) " +
                        "VALUES (%f,'%s', %d, '%s')",
                data,
                _dateFormat.format(_date),
                TESTEPC,
                nome );
    }

<<<<<<< Updated upstream
    public String insertMemoryUpdate(long data) {
        return String.format(Locale.US, "INSERT INTO MemoryData (Usage_Memoria, Horario) " +
                        "VALUES (%d,'%s')",
                data,
                _dateFormat.format(_date));
=======
    public String insertMemoryUpdate(int idPc, long total, long usable) {
                return String.format(Locale.US, "INSERT INTO MemoryData "
                + "(ID_PC, Total_Memory, Usable_Memory, Horario) VALUES\n" +
                "((%s, %s, %s, %s))", 2, total, usable, _dateFormat.format(_date));
>>>>>>> Stashed changes
    }

    public String insertDiskUpdate(long data) {
        return String.format(Locale.US, "INSERT INTO DiskData (Usage_Disk, Horario) " +
                        "VALUES (%d,'%s')",
                data,
                _dateFormat.format(_date));
    }

    public String insertOSUpdate(int bitness, String family){
        return String.format(Locale.US, "INSERT INTO OSData (ID_PC, Bitness_OS, OS_Family) VALUES (6, %d, '%s')",
                bitness,
                family);
    }
}
