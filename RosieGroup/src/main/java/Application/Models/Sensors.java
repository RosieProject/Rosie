
package Application.Models;




public class Sensors {
    
    private static Sensors ourInstance = new Sensors();
    
    private static int fanSpeed;
    private static double cpuTemperature;
    private static double cpuVoltage;

    
    public static int getFanSpeed() {
        return fanSpeed;
    }
    public static void setFanSpeed(int fanSpeed) {
        Sensors.fanSpeed = fanSpeed;
    }

    
    public static double getCpuTemperature() {
        return cpuTemperature;
    }
    public static void setCpuTemperature(double cpuTemperature) {
        Sensors.cpuTemperature = cpuTemperature;
    }

    
    public static double getCpuVoltage() {
        return cpuVoltage;
    }
    public static void setCpuVoltage(double cpuVoltage) {
        Sensors.cpuVoltage = cpuVoltage;
    }

    public static Sensors getSensors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static double setCpuTemperature() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
    
    
    
    
    
    
}
