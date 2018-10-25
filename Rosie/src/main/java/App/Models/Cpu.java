package App.Models;

import oshi.hardware.CentralProcessor;

public class Cpu{
    private double cpuUsage;
    private CentralProcessor centralProcessor;
    
    public void setCpuUsage(double cpuUsage){
        this.cpuUsage = cpuUsage;
    }
    
    public double getCpuUsage(){
        return cpuUsage;
    }
    
    public void setCentralProcessor(CentralProcessor centralProcessor){
        this.centralProcessor = centralProcessor;
    }
    
    public CentralProcessor getCentralProcessor(){
        return centralProcessor;
    }
    
}
