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
        Computer.setProcessCount(operatingSystem.getProcessCount());
        Computer.setThreadCount(operatingSystem.getThreadCount());
        Computer.setVersion(operatingSystem.getVersion().toString());
        Computer.setManufacturer(operatingSystem.getManufacturer());
        Computer.setNetworkParams(operatingSystem.getNetworkParams().toString());
        
        /*Computer.getIpv4(operatingSystem.getNetworkParams().getIpv4DefaultGateway());
        Computer.getIpv6(operatingSystem.getNetworkParams().getIpv6DefaultGateway());
        Computer.getDomainName(operatingSystem.getNetworkParams().getDomainName());
        Computer.getHostName(operatingSystem.getNetworkParams().getHostName());*/
    }
}
