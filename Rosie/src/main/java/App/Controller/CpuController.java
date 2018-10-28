package App.Controller;

import App.Commons.ControllerCommon;
import App.Handler.ComputerHardwareHandler;
import App.Handler.Get.GetCPUData;
import App.Handler.Send.SendCPUData;
import App.Models.Cpu;
import Infrastructure.MicrosoftJDBC.AzureDatabaseConnection;
import oshi.hardware.CentralProcessor;

import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.Connection;

public class CpuController extends ControllerCommon{
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


