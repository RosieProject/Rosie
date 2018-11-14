/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application.Handlers.Get;

import Application.Interfaces.IGetData;
import Application.Models.Computer;
import oshi.software.os.OperatingSystem;


public class GetComputerData implements IGetData{

    private OperatingSystem operatingsystem;
    
    public GetComputerData(){
        operatingsystem = Computer.getOperatingSystem();
        GetData();
    }
    
    
    
    @Override
    public void GetData() {
        Computer.setBitness(operatingsystem.getBitness());
        Computer.setFamily(operatingsystem.getFamily());
        
    }
    
    
    
    
    
}
