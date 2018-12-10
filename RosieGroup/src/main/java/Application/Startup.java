package Application;

import Application.Handlers.GetHardwareDataHandler;
import Application.Handlers.SendHardwareDataHandler;
/*import Application.Models.Computer;
import Application.Models.Cpu;
import Application.Models.Disk;
import Application.Models.Memory;
import Application.Models.Sensors;
import Application.Helper.GetLog;*/
//-----------------------------

import Application.Helper.GetLog;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Startup {
    public static void main(String[] args) throws InterruptedException, IOException {
        while (true) {
            Thread.sleep(5000);
            new GetHardwareDataHandler();
            new SendHardwareDataHandler();

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
           
             /*File file = new File("ArquivoLog");
             file.mkdir();*/
             
             GetLog log = new GetLog();
            
    
             File logArquivo = new File("logArquivo.txt");
             logArquivo.createNewFile();
              
              try (FileWriter fileWriter = new FileWriter(logArquivo, true); 
              BufferedWriter escrever = new BufferedWriter(fileWriter)) {
              escrever.write(log.getLog());  
              }catch(IOException ex){
              }
            //System.out.print(log.getLog());
        }
    }
}
