package Missions;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class IntelligenceMission extends Mission{
    public Coordinates regionCoordinates;
    public String region;

    public IntelligenceMission(String region, Coordinates regionCoordinates) {
        this.regionCoordinates = regionCoordinates;
        this.region = region;

    }

    @Override
    public String getPlace() {
        return this.region;
    }
}
