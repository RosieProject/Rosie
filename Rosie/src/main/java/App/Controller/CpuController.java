package App.Controller;

import App.Commons.ControllerCommon;
import App.Handler.ComputerHardwareHandler;
import App.Handler.Get.GetCPUData;
import App.Models.Cpu;
import App.Models.Hardware;
import oshi.hardware.CentralProcessor;

public class CpuController extends ControllerCommon{
    private Hardware _hardware;
    private Cpu _cpu;

    @Override
    public Hardware getHandler() {
        CentralProcessor centralProcessor = new ComputerHardwareHandler().getCentralProcessor();
        _cpu.setCentralProcessor(centralProcessor);
        _hardware.setCpu(_cpu);
        
        _hardware = new GetCPUData(_hardware).get();
        
        return _hardware;   
    }

    @Override
    public void sendHandler() {
        
    }
    
    

}


