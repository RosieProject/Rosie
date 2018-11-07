package App.Models;

import oshi.hardware.GlobalMemory;

public class Memory extends Hardware{
    private GlobalMemory globalMemory;
    private long memoryUsage;

    public void setMemoryUsage(long memoryUsage){
        this.memoryUsage = memoryUsage;
    }

    public long getMemoryUsage(){
        return this.memoryUsage;
    }

    public void setGlobalMemory(GlobalMemory globalMemory){
        this.globalMemory = globalMemory;
    }

    public GlobalMemory getGlobalMemory(){
        return globalMemory;
    }
}
