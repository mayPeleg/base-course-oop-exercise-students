package AerialVehicles;

import Missions.Mission;

public class HermesUavAircraft extends UavAircraft implements AerialBdaVehicle{
    public final int MAX_HOURS_OF_FLIGHT_UNTIL_REPAIR = 100;
    public String cameraType;

    public HermesUavAircraft(String cameraType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flightStatus) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, flightStatus, 100, sensorType);
        this.cameraType = cameraType;
    }

    public String  preformBda(){
        return this.pilotName+": "+this.getClass()+" taking pictures of "+this.mission.getPlace()+" with: "+this.cameraType+" camera";
    }
}
