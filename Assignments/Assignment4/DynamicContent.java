package Assignments.Assignment4;

public class DynamicContent extends Content {
    public int duration;

    public DynamicContent(String name, String description, String location, int duration) {
        super(name, description, location);
        if (duration < 0) {
            this.duration = 0;
        } else {
            this.duration = duration;
        }
    }
    
    // accessor and mutator methods
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        if (duration < 0) {
            this.duration = 0;
        } else {
            this.duration = duration;
        }
    }

    // override toString method
    public String toString() {
        return "#" + id + ":" + name + "\n" + description + "\n" + location + "\nDuration: " + duration/1000 + " seconds";
    }

}
