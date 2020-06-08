package AerialVehicles;

import Missions.Mission;

public class FightAircraft extends AerialVehicle implements AerialAttackVehicle{
    public int missiles;
    public String missileType;
    public final int MAX_HOURS_OF_FLIGHT_UNTIL_REPAIR = 250;

    FightAircraft(String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flightStatus, int missiles, String missileType) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, flightStatus, 250);
        this.missiles = missiles;
        this.missileType = missileType;
    }

    public String attack() {
        return this.pilotName+": "+this.getClass()+" Attacking  "+this.mission.getPlace()+" with:"+this.missileType+"X"+this.missiles;
    }
}
