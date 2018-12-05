
package Application.Models;

import Application.ComputerInformation;
import oshi.software.os.OperatingSystem;

public class Computer {
    private static Computer ourInstance = new Computer();
    
    private static OperatingSystem operatingSystem;
    private static int osBitness;
    private static String osFamily;
    
    private static int processCount;
    private static int threadCount;
    private static String version;
    private static String manufacturer;
    private static String networkParams;
    private static String domainName;
    private static String ipv4;
    private static String hostName;
    private static String ipv6;
    

    public static String getIpv6() {
        return ipv6;
    }
    public static void setIpv6(String ipv6) {
        Computer.ipv6 = ipv6;
    }
    
    
    public static String getHostName() {
        return hostName;
    }
    public static void setHostName(String hostName) {
        Computer.hostName = hostName;
    }
    
    
    public static String getIpv4() {
        return ipv4;
    }
    public static void setIpv4(String Ipv4) {
        Computer.ipv4 = Ipv4;
    }
    
    
    public static String getDomainName() {
        return domainName;
    }
    public static void setDomainName(String domainName) {
        Computer.domainName = domainName;
    }
    
    
    public static String getNetworkParams() {
        return networkParams;
    }
    public static void setNetworkParams(String networkParams) {
        Computer.networkParams = networkParams;
    }
   

    public static String getManufacturer() {
        return manufacturer;
    }
    public static void setManufacturer(String manufacturer) {
        Computer.manufacturer = manufacturer;
    }
    
    
    public static String getVersion() {
        return version;
    }
    public static void setVersion(String version) {
        Computer.version = version;
    }
    
    
    public static int getThreadCount() {
        return threadCount;
    }
    public static void setThreadCount(int threadCount) {
        Computer.threadCount = threadCount;
    }
    
    
    public static int getProcessCount() {
        return processCount;
    }
    public static void setProcessCount(int processCount) {
        Computer.processCount = processCount;
    }
    

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

    public static void getIpv4(String ipv4DefaultGateway) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void getIpv6(String ipv6DefaultGateway) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void getDomainName(String domainName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void getHostName(String hostName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Computer() {
        operatingSystem = new ComputerInformation().getOperatingSystem();
    }
}
