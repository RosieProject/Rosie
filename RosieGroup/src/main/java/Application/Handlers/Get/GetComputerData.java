package Application.Handlers.Get;

import Application.Interfaces.IGetData;
import Application.Models.Computer;
import oshi.software.os.OperatingSystem;

public class GetComputerData implements IGetData{

    private OperatingSystem operatingSystem;
    
    public GetComputerData(){
        operatingSystem = Computer.getOperatingSystem();
        GetData();
    }

    public void GetData() {
        Computer.setBitness(operatingSystem.getBitness());
        Computer.setFamily(operatingSystem.getFamily());
    }
}
