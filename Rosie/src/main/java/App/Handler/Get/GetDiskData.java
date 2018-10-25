package App.Handler.Get;

import App.Commons.GetDataCommon;
import App.Models.Hardware;

public class GetDiskData extends GetDataCommon{
    private Hardware _hardware;
    public GetDiskData() {
    }

    @Override
    public Hardware get() {
        return _hardware;
    }
    
}
