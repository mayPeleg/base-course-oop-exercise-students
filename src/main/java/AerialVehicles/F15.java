package AerialVehicles;

import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F15 extends FightAircraft implements AerialIntelligenceVehicle{
    public String sensorType;

    public F15(String sensorType, int missiles, String missileType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flightStatus){
        super(pilotName, mission, hoursOfFlightSinceLastRepair, flightStatus, missiles, missileType );
        this.sensorType = sensorType;
    }

    public String collectIntelligence() {
        return this.pilotName+": F15 collecting data in "+this.mission.getPlace()+" with sensor type: "+this.sensorType;
    }

}
