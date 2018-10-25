package App.Commons;

import App.Models.Hardware;

public abstract class ControllerCommon {
    public abstract Hardware getHandler();
    public abstract void sendHandler();
}
