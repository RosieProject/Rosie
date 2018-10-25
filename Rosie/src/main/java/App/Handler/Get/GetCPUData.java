package App.Handler.Get;

import App.Commons.GetDataCommon;
import App.Models.Cpu;

public class GetCPUData extends GetDataCommon{
    private Cpu _cpu;
    
    public GetCPUData(Cpu cpu)
    {
        _cpu = cpu;
    }

    public Cpu get() {

    _cpu.setCpuUsage(_cpu.getCentralProcessor().getSystemCpuLoadBetweenTicks());
    
    return _cpu;
    }
}
