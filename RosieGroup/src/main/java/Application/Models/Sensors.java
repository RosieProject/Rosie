
package Application.Models;




public class Sensors {
    
    private static Sensors ourInstance = new Sensors();
    
    private static int fanSpeed;
    private static double cpuTemperature;
    private static double cpuVoltage;

    
    public static int getFanSpeed() {
        return fanSpeed;
        // esta retornando 0
    }
    public static void setFanSpeed(int fanSpeed) {
        Sensors.fanSpeed = fanSpeed;
    }

    
    public static double getCpuTemperature() {
        return cpuTemperature;
        // esta retornando 0
    }
    public static void setCpuTemperature(double cpuTemperature) {
        Sensors.cpuTemperature = cpuTemperature;
    }

    
    public static double getCpuVoltage() {
        return cpuVoltage;
        // esta retornando 0
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
    
    public static String sensorLogResponse() {
         return "Sensor information:" + System.getProperty("line.separator") +
                 "CpuTemperature:" +getCpuTemperature()+ System.getProperty("line.separator") +
                 "CpuVoltage:" +getCpuVoltage()+ System.getProperty("line.separator") +
                 "FanSpeed:" +getFanSpeed()+ System.getProperty("line.separator") + System.getProperty("line.separator");
    }

    
    
    
    
    
    
    
    
    
    
    
    
}
