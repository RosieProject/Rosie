package Application.Models;

import Application.ComputerInformation;
import oshi.software.os.OSFileStore;

public class Disk {
    private static Disk ourInstance = new Disk();

    private static long diskTotal;
    private static long diskAvailable;
    private static String name;
    

    
    public static String getName() {
        return name;
    }
    public static void setName(String name) {
        Disk.name = name;
    }
    
    
    public static long getDiskTotal(){
        return diskTotal;
    }
    public static void setDiskTotal(long total){
        diskTotal = total;
    }
    

    public static long getDiskAvailable(){
        return diskAvailable;
    }
    public static void setDiskAvailable(long available){
        diskAvailable = available;
    }
    

    public static OSFileStore[] getFileStores(){
        return new ComputerInformation().getFileStores();
    }

    public static Disk getInstance() {
        return ourInstance;
    }

    private Disk() {

    }
}
