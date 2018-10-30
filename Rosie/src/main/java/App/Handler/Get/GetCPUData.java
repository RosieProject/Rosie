package App.Handler.Get;

import App.Commons.GetDataCommon;
import App.Models.Cpu;

public class GetCPUData implements GetDataCommon{
    private Cpu _cpu;
    
    public GetCPUData(Cpu cpu){
        _cpu = cpu;
    }

    @Override
    public Cpu get() {
    _cpu.setCpuUsage(_cpu.getCentralProcessor().getSystemCpuLoad() * 100);
    
    return _cpu;
    }
}
