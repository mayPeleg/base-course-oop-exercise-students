package AerialVehicles;

import Missions.Mission;

public class UavAircraft extends AerialVehicle implements  AerialIntelligenceVehicle{
    public String sensorType;

    UavAircraft(String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flightStatus, int maxHoursOfFlightUntilRepair, String sensorType) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, flightStatus, maxHoursOfFlightUntilRepair);
        this.sensorType = sensorType;
    }

    public String collectIntelligence() {
        return this.pilotName+":"+this.getClass()+"collecting data in "+this.mission.getPlace()+" with sensor type: "+this.sensorType;
    }
}
