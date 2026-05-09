package smarthaven.device;

import java.util.HashMap;

import smarthaven.util.UnsupportedDeviceException;
import smarthaven.device.Category;
import smarthaven.util.BaseModel;

public class ActionDevice extends BaseModel {
    private final HashMap<String, String[]> actionToSteps;
    private final HashMap<String, Integer> actionIdx;

    public ActionDevice(String identifer, Category deviceType) throws UnsupportedDeviceException {
        if(deviceType == Category.LED_STRIP || deviceType == Category.LIGHT)
        {
            throw new UnsupportedDeviceException("HIBA");
        }
        actionToSteps = new HashMap<String, String[]>();
        actionIdx = new HashMap<String, Integer>();
        super(identifer, deviceType);
    }

    public int totalStepCount(){
        int res = 0;
        for(String[] parts : actionToSteps.values())
        {
            res += parts.length;
        }
        return res;
    }
    //befejezni a többi metódust
    @Override
    public String toString(){
        return "Device: ActionDevice, Type: " + this.getDeviceType() + ", Identifier: "+this.identifier+", PowerStatus: "+this.powerStatus+", "+actionToSteps.size()+" actions with "+totalStepCount()+" steps "; 
    }

    public void setAction(String actionType, String details){
        if(details.isEmpty()){
            throw new IllegalArgumentException();
        }
        String[] details_t = details.split(";");
        actionToSteps.put(actionType,details_t);
    }
}