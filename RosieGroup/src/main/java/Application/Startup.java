package Application;

import Application.Handlers.GetHardwareDataHandler;
import Application.Handlers.SendHardwareDataHandler;
import Application.Models.Computer;
import Application.Models.Cpu;
import Application.Models.Disk;
import Application.Models.Memory;
import Application.Models.Sensors;

public class Startup {
    public static void main(String[] args) throws InterruptedException {

        while (true) {
            Thread.sleep(3000);
            new GetHardwareDataHandler();
            new SendHardwareDataHandler();
 
        }

    }
}
