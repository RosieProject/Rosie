
package Application.Handlers.Get;

import Application.Interfaces.IGetData;
import Application.Models.Sensors;

public abstract class GetSensors implements IGetData  {

   private final Sensors sensors;
   
   public GetSensors(){
       
       sensors = Sensors.getSensors();
        GetData();
      }
   
   public void getData(){
       
       Sensors.setCpuTemperature(Sensors.setCpuTemperature());
       Sensors.setFanSpeed(Sensors.getFanSpeed());
       Sensors.setCpuVoltage(Sensors.getCpuVoltage());
       
       
       
   }
   
    
}
