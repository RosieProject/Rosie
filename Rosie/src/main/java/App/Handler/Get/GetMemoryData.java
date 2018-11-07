package App.Handler.Get;

import App.Commons.GetDataCommon;
import App.Models.Memory;

public class GetMemoryData implements GetDataCommon {
    private Memory _memory;

    public GetMemoryData(Memory memory){
        _memory = memory;
    }

    @Override
    public Memory get() {
        _memory.setMemoryUsage(_memory.getGlobalMemory().getTotal() - _memory.getGlobalMemory().getAvailable());

        return _memory;
    }
}
