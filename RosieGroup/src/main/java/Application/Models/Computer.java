
package Application.Models;

import Application.ComputerInformation;
import oshi.software.os.OperatingSystem;

public class Computer {
    private static Computer ourInstance = new Computer();
    
    private static OperatingSystem operatingSystem;
    private static int osBitness;
    private static String osFamily;

    public static int getBitness() {
        return osBitness;
    }

    public static void setBitness(int bitness) {
        osBitness = bitness;
    }

    public static String getFamily() {
        return osFamily;
    }

    public static void setFamily(String family) {
        osFamily = family;
    }

    public static OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }
    
    private Computer() {
        operatingSystem = new ComputerInformation().getOperatingSystem();
    }
}
