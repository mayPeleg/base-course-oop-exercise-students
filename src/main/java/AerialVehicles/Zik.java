package AerialVehicles;

import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Zik extends HermesUavAircraft{
    public Zik(String cameraType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flightStatus) {
        super( cameraType, sensorType, pilotName, mission, hoursOfFlightSinceLastRepair, flightStatus);
    }
}
