package AerialVehicles;

import Missions.AttackMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Kochav extends HermesUavAircraft implements AerialAttackVehicle{
    public int missiles;
    public String missileType;

    public Kochav(int missiles, String missileType, String cameraType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flightStatus) {
        super(cameraType, sensorType, pilotName, mission, hoursOfFlightSinceLastRepair, flightStatus);
        this.missiles = missiles;
        this.missileType = missileType;
    }

    public String attack() {
        return this.pilotName+": kochav Attacking  "+this.mission.getPlace()+" with:"+this.missileType+"X"+this.missiles;
    }

}
