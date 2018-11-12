package Application.Models;

import Application.ComputerInformation;
import oshi.hardware.GlobalMemory;

public class Memory {
    private static Memory ourInstance = new Memory();

    private static GlobalMemory globalMemory;
    private static long memoryTotal;
    private static long memoryAvailable;

    public static Memory getInstance() {
        return ourInstance;
    }

    public static void setMemoryTotal(long total){
        memoryTotal = total;
    }

    public static long getMemoryTotal(){
        return memoryTotal;
    }

    public static void setMemoryAvailable(long available){
        memoryAvailable = available;
    }

    public static long getMemoryAvailable(){
        return memoryAvailable;
    }

    public static GlobalMemory getGlobalMemory(){
        return globalMemory;
    }

    private Memory() {
        globalMemory = new ComputerInformation().getGlobalMemory();
    }
}
