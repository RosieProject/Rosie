package Application.Helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormater {
    public static final DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date _date;

    public Date getDate(){
        return _date;
    }

    public DateFormater(){
        this._date = new Date();
    }
}
