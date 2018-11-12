package Application;

import Application.Handlers.GetHardwareDataHandler;
import Application.Handlers.SendHardwareDataHandler;
import Application.Models.Cpu;
import Application.Models.Disk;
import Application.Models.Memory;

public class Startup {
    public static void main(String[] args) throws InterruptedException {

        while (true) {
            Thread.sleep(5000);
            new GetHardwareDataHandler();
            new SendHardwareDataHandler();

            System.out.println(Cpu.getCpuUsage());
            System.out.println(Memory.getMemoryTotal() - Memory.getMemoryAvailable());
            System.out.println(Disk.getDiskTotal() - Disk.getDiskAvailable());
        }

    }
}
