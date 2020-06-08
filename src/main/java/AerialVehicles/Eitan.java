package AerialVehicles;

import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Eitan extends HaronUavAircraft{

    public Eitan(int missiles, String missileType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flightStatus){
        super(pilotName, mission, hoursOfFlightSinceLastRepair, flightStatus, missiles, missileType, sensorType );
    }
}
