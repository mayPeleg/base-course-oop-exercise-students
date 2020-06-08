package Missions;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class AttackMission extends Mission{
    public Coordinates targetCoordinates;
    public String target;

    public AttackMission(String target, Coordinates targetCoordinates) {
        this.target = target;
        this.targetCoordinates = targetCoordinates;
    }

    @Override
    public String getPlace() {
        return this.target;
    }

    @Override
    public Coordinates getPlaceCoordinat() {
        return this.targetCoordinates;
    }
}
