package App.Handler.Get;

import App.Commons.GetDataCommon;
import App.Models.Hardware;

public class GetMemoryData extends GetDataCommon{
    private Hardware _hardware;
    public GetMemoryData() {
    }

    @Override
    public Hardware get() {
        return _hardware;
    }
    
}
