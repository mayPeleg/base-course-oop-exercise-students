package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;

public interface AerialVehicleService {
    public String pilotName="";
    public Mission mission= new Mission() {};
    public int hoursOfFlightSinceLastRepair = 0;
    public boolean flightStatus = true;

    public void flyTo();
    public void land();
    public void check();
    public void repair();
}
