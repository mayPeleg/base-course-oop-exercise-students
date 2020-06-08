package AerialVehicles;

import Missions.Mission;

public class HaronUavAircraft extends UavAircraft implements AerialAttackVehicle{
    public final int MAX_HOURS_OF_FLIGHT_UNTIL_REPAIR = 150;
    public int missiles;
    public String missileType;

    public HaronUavAircraft(String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flightStatus, int missiles, String missileType, String sensorType) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, flightStatus, 150, sensorType);
        this.missiles = missiles;
        this.missileType = missileType;
    }

    public String attack() {
        return this.pilotName+": "+this.getClass()+" Attacking  "+this.mission.getPlace()+" with:"+this.missileType+"X"+this.missiles;
    }

}
