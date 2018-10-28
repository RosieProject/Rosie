package Infrastructure.MicrosoftJDBC.Repositories;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HardwareDataRepository {

    public String getInsertCpuQuery(double data) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return String.format("INSERT INTO Cpu_Data VALUES ('%.2f','%s')", data, dateFormat.format(date));
    }
}

