package AerialVehicles;

import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Shoval extends HaronUavAircraft implements AerialBdaVehicle{
    public String cameraType;

    public Shoval(String cameraType, int missiles, String missileType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flightStatus ) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, flightStatus, missiles,missileType, sensorType);
        this.cameraType = cameraType;
    }

    public String  preformBda(){
        return this.pilotName+": "+this.getClass()+" taking pictures of "+this.mission.getPlace()+" with: "+this.cameraType+" camera";
    }
}

