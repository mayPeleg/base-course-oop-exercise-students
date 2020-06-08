package Missions;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class BdaMission extends Mission{
    public Coordinates objectiveCoordinates;
    public String objective;

    public BdaMission(String objective, Coordinates objectiveCoordinates) {
        this.objectiveCoordinates = objectiveCoordinates;
        this.objective = objective;
    }

    @Override
    public String getPlace() {
        return this.objective;
    }

    @Override
    public Coordinates getPlaceCoordinat() {
        return this.objectiveCoordinates;
    }
}
