package Application;

import Application.Handlers.GetHardwareDataHandler;
import Application.Handlers.SendHardwareDataHandler;
import Application.Models.Cpu;

public class Startup {
    public static void main(String[] args) throws InterruptedException {

        while (true) {
            Thread.sleep(3000);
            new GetHardwareDataHandler();
            new SendHardwareDataHandler();

            /*System.out.println(Cpu.getCpuUsage());
            System.out.println(Memory.getMemoryTotal() - Memory.getMemoryAvailable());
            System.out.println(Disk.getDiskTotal() - Disk.getDiskAvailable());*/
            System.out.println(Cpu.getCpuName());
        }

    }
}
