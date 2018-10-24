package App.Controller;

import oshi.hardware.platform.windows.WindowsCentralProcessor;

public class Cpu {
    private WindowsCentralProcessor _centralProcessor = new WindowsCentralProcessor();
    private long _cpuUsage;
   
    public WindowsCentralProcessor getCentralProcessor(){
        return _centralProcessor;
    }
    
    public double getCpuUsage(){
        return _cpuUsage;
    }
    
    
    
    
}


