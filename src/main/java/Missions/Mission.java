package Missions;


public abstract class Mission implements MissionService{

    public Mission() {}

    public String getPlace() {
        return "";
    }

    public void begin() {
        System.out.println("Beginning Mission!");
    }
    public void cancel() {
        System.out.println("Abort Mission!");
    }
    public void finish() {
        System.out.println("Finish Mission!");
    }

}
