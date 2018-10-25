package App.Handler.Get;

import App.Commons.GetDataCommon;
import App.Models.Cpu;
import App.Models.Hardware;
import oshi.hardware.CentralProcessor;

public class GetCPUData extends GetDataCommon{
    private Hardware _hardware;
    
    public GetCPUData(Hardware hardware){
        _hardware = hardware;
    }
    
    @Override
    public Hardware get() {
        
    Cpu cpu = _hardware.getCpu();
    
    cpu.setCpuUsage(cpu.getCentralProcessor().getSystemCpuLoadBetweenTicks());
    
    _hardware.setCpu(cpu);
    
    return _hardware;
    }
}
