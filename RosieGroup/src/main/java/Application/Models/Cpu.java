package Application.Models;

import Application.ComputerInformation;
import oshi.hardware.CentralProcessor;



public class Cpu {
    private static Cpu ourInstance = new Cpu();

    private static CentralProcessor centralProcessor;
    private static double cpuUsage;
    private static String cpuName;
    
    private static int processadoresLogicos;
    private static int processadoresFisicos;
    private static long interrupts;
    private static long systemUpTime;
    
    
    
    public static long getSystemUpTime() {
        return systemUpTime;
    }
    public static void setSystemUpTime(long systemUpTime) {
        Cpu.systemUpTime = systemUpTime;
    }
    
    
    public static long getInterrupts() {
        return interrupts;
    }
    public static void setInterrupts(long interrupts) {
        Cpu.interrupts = interrupts;
    }
    
    
    public static int getProcessadoresFisicos() {
        return processadoresFisicos;
    }
    public static void setProcessadoresFisicos(int processadoresFisicos) {
        Cpu.processadoresFisicos = processadoresFisicos;
    }
    
    
    public static int getProcessadoresLogicos() {
        return processadoresLogicos;
    }
    public static void setProcessadoresLogicos(int processadoresLogicos) {
        Cpu.processadoresLogicos = processadoresLogicos;
    }
    
    
    public static String getCpuName() {
        return cpuName;
    }
    public static void setCpuName(String name) {
        cpuName = name;
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
    
    public static String CpuLogResponse(){
        return "Cpu information:" + System.getProperty("line.separator") +
                "CpuName:" +getCpuName()+ System.getProperty("line.separator") +
                "CpuUsage:" +getCpuUsage()+ System.getProperty("line.separator") +
                "Interrupts:" +getInterrupts()+ System.getProperty("line.separator") +
                "ProcessadoresFisicos:" +getProcessadoresFisicos()+ System.getProperty("line.separator") +
                "ProcessadoresLogicos:" +getProcessadoresLogicos()+ System.getProperty("line.separator") +
                "SystemUpTime:" + getSystemUpTime() + System.getProperty("line.separator") + System.getProperty("line.separator");
    }
    
    
}
