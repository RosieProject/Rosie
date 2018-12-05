package Application.Handlers.Get;

import Application.Interfaces.IGetData;
import Application.Models.Cpu;
import oshi.hardware.CentralProcessor;

public class GetCpuData implements IGetData {
    private CentralProcessor centralProcessor;

    public GetCpuData(){
        centralProcessor = Cpu.getCentralProcessor();
        GetData();
        
    }

    public void GetData(){
        Cpu.setCpuUsage(centralProcessor.getSystemCpuLoadBetweenTicks());
        Cpu.setCpuName(centralProcessor.getName());
        
        Cpu.setProcessadoresLogicos(centralProcessor.getLogicalProcessorCount());
        Cpu.setProcessadoresFisicos(centralProcessor.getPhysicalProcessorCount());
        Cpu.setInterrupts(centralProcessor.getInterrupts());
        Cpu.setSystemUpTime(centralProcessor.getSystemUptime());
        
        
    }
}
