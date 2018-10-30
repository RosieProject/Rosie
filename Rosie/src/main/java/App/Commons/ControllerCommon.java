package App.Commons;

import App.Models.Hardware;

import javax.sql.DataSource;

public interface ControllerCommon {
    Hardware getHandler();
    void sendHandler(DataSource dataSource);
}
