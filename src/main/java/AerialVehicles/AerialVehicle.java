package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle {
    public String pilotName;
    public Mission mission;
    public int hoursOfFlightSinceLastRepair;
    public boolean flightStatus;
    public int maxHoursOfFlightUntilRepair;

    AerialVehicle(String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flightStatus, int maxHoursOfFlightUntilRepair) {
        this.pilotName = pilotName;
        this.mission = mission;
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
        this.flightStatus = flightStatus;
        this.maxHoursOfFlightUntilRepair = maxHoursOfFlightUntilRepair;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public int getHoursOfFlightSinceLastRepair() {
        return this.hoursOfFlightSinceLastRepair;
    }
    public void setHoursOfFlightSinceLastRepair(int num) {
        this.hoursOfFlightSinceLastRepair = num;
    }

    public void flyTo(Coordinates destination) {
        System.out.println("Flying to:"+destination.getLongitude()+", "+destination.getLatitude());
    }
    public void land() {
        System.out.println(("Landing"));
    }
    public void check(){
        if(this.maxHoursOfFlightUntilRepair>this.hoursOfFlightSinceLastRepair) {
            this.repair();
        }
    }
    public void repair(){
        this.flightStatus = true;
        this.hoursOfFlightSinceLastRepair = 0;
    }
}
