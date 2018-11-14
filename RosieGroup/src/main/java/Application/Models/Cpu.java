package Application.Models;

import Application.ComputerInformation;
import oshi.hardware.CentralProcessor;

public class Cpu {
    private static Cpu ourInstance = new Cpu();

    private static CentralProcessor centralProcessor;
    private static double cpuUsage;
    private static String cpuName;

    public static String getCpuName() {
        return cpuName;
    }

    public static void setCpuName(String name) {
        cpuName = name;
    }

    public static Cpu getInstance() {
        return ourInstance;
    }

    public static double getCpuUsage(){
        return cpuUsage * 100;
    }

    public static void setCpuUsage(double usage){
        cpuUsage = usage;
    }

    public static CentralProcessor getCentralProcessor(){
        return centralProcessor;
    }

    private Cpu() {
        centralProcessor = new ComputerInformation().getCentralProcessor();
    }
    
    
}
