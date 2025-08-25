//Manager class
//represents the manager who calls for a meeting and wastes time
public class OfficeManager {
    private String name;
    private double timeWasted;

    //Constructors
    public OfficeManager(String name, double timeWasted) {
        this.name = name;
        this.timeWasted = timeWasted;
    }
    public OfficeManager() {
        this.name = "Michael";
        this.timeWasted = 0;
    }

    //Setters and Getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getTimeWasted() {
        return timeWasted;
    }
    public void setTimeWasted(double timeWasted) {
        this.timeWasted = timeWasted;
    }

    //Custom methods organizeMeeting displays a message with the meeting's purpose and location
    public void organizeMeeting(String meetingReason, String meetingLocation){
        System.out.println(name + "  is organizing a meeting for " + meetingReason + " in the " + meetingLocation);
    }

    public void printDetails(){
        System.out.println("Office Manager " + name + " has wasted " + timeWasted + " minutes this year.");
    }
}
