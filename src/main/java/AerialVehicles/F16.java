package AerialVehicles;

import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F16 extends FightAircraft implements AerialBdaVehicle{
    public String cameraType;

    public F16(String cameraType, int missiles, String missileType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flightStatus) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, flightStatus, missiles, missileType);
        this.cameraType = cameraType;
    }

    public String  preformBda(){
        return this.pilotName+": F16 taking pictures of "+this.mission.getPlace()+" with: "+this.cameraType+" camera";
    }
}
