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

    public static void getSystemUpTime(long systemUptime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private Cpu() {
        centralProcessor = new ComputerInformation().getCentralProcessor();
    }
    
    
}
