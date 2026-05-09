package smarthaven.util;

import smarthaven.device.Category;

public class BaseModel implements IotFunction{
    protected boolean powerStatus;
    protected String identifier;
    private final Category deviceType;

    public boolean getPowerStatus(){
        return this.powerStatus;
    }

    public String getIdentifier(){
        return this.identifier;
    }

    public Category getDeviceType(){
        return this.deviceType;
    }

    public BaseModel(String identifier, Category deviceType) throws IllegalArgumentException{
        if(identifier == null)
        {
            throw new IllegalArgumentException();
        }
        this.identifier = identifier;
        this.deviceType = deviceType;
        this.powerStatus = false;
    }

    @Override
    public void turnOn(){
        this.powerStatus = true;
    }

    @Override
    public void turnOff(){
        this.powerStatus = false;
    }

    @Override
    public String toString(){
        return "Device: BaseModel, Type: " + this.deviceType + ", Identifier: "+this.identifier+", PowerStatus: "+this.powerStatus; 
    }
}