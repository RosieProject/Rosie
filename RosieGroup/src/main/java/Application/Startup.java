package Application;

import Application.Handlers.GetHardwareDataHandler;
import Application.Handlers.SendHardwareDataHandler;
import Application.Models.Computer;
import Application.Models.Cpu;
import Application.Models.Disk;
import Application.Models.Memory;
import Application.Models.Sensors;
import Application.Helper.GetLog;

public class Startup {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Thread.sleep(3000);
            new GetHardwareDataHandler();
            //new SendHardwareDataHandler();

            //System.out.println(Cpu.getCpuUsage());
            //System.out.println(Memory.getMemoryTotal() - Memory.getMemoryAvailable());
            //System.out.println(Disk.getDiskTotal() - Disk.getDiskAvailable());
            //System.out.println(Cpu.getCpuName());
            
            //System.out.println(Cpu.getProcessadoresLogicos());
            //System.out.println(Cpu.getProcessadoresFisicos());
            //System.out.println(Cpu.getInterrupts());
            
            //System.out.println(Cpu.getSystemUpTime());
            //System.out.println(Computer.getProcessCount());
            //System.out.println(Computer.getThreadCount());
            //System.out.println(Computer.getVersion());
            //System.out.println(Computer.getManufacturer());
            //System.out.println(Computer.getNetworkParams());
            //System.out.println(Memory.getPageSize());
            //System.out.println(Disk.getName());
            //System.out.println(Sensors.getCpuTemperature());
            //System.out.println(Sensors.getCpuVoltage());
            //System.out.println(Sensors.getFanSpeed());
            //------------------------------------------------
            //System.out.println(Computer.getIpv4());
            //System.out.println(Computer.getIpv6());
            //System.out.println(Computer.getDomainName());
            //System.out.println(Computer.getHostName());
            GetLog log = new GetLog();
            System.out.print(log.getLog());

            
            
            
            
        }

    }
}
