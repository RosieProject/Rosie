package App.Controller;

import App.Commons.ControllerCommon;
import App.Handler.ComputerHardwareHandler;
import App.Handler.Get.GetMemoryData;
import App.Handler.Send.SendMemoryData;
import App.Models.Hardware;
import App.Models.Memory;

import javax.sql.DataSource;

public class MemoryController implements ControllerCommon {
    private Memory _memory;

    public MemoryController(Memory memory){
        _memory = memory;
    }

    @Override
    public Memory getHandler() {
        _memory.setGlobalMemory(new ComputerHardwareHandler().getGlobalMemory());

        _memory = new GetMemoryData(_memory).get();

        return _memory;
    }

    @Override
    public void sendHandler(DataSource dataSource) {
        new SendMemoryData(_memory, dataSource).Send();
    }
}
