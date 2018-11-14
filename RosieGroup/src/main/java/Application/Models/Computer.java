
package Application.Models;

import Application.ComputerInformation;
import oshi.software.os.OperatingSystem;


public class Computer {
    
    private static OperatingSystem operatingSystem;
    private static int bitness;
    private static String family;

    public static int getBitness() {
        return bitness;
    }

    public static void setBitness(int bitness) {
        Computer.bitness = bitness;
    }

    public static String getFamily() {
        return family;
    }

    public static void setFamily(String family) {
        Computer.family = family;
    }

    public static OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public static void setOperatingSystem(OperatingSystem ooperatingSystem) {
        operatingSystem = ooperatingSystem;
    }
    
    private Computer() {
        operatingSystem = new ComputerInformation().getOperatingSystem();
    }
    
    private static class ComputerHolder {

        private static final Computer INSTANCE = new Computer();
        
    }
}
