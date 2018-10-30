package App.Controller;

import App.Commons.ControllerCommon;
import App.Handler.ComputerHardwareHandler;
import App.Handler.Get.GetCPUData;
import App.Handler.Send.SendCPUData;
import App.Models.Cpu;

import javax.sql.DataSource;

public class CpuController implements ControllerCommon{
    private Cpu _cpu;

    public CpuController(Cpu cpu)
    {
        _cpu = cpu;
    }

    public Cpu getHandler() {
        _cpu.setCentralProcessor(new ComputerHardwareHandler().getCentralProcessor());
        
        _cpu = new GetCPUData(_cpu).get();
        
        return _cpu;
    }

    @Override
    public void sendHandler(DataSource dataSource) {
        new SendCPUData(_cpu, dataSource).Send();
    }
}


