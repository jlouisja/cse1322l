package Assignments.Assignment3;

public class VideoContent extends DynamicContent{
    public int resolution;

    public VideoContent(String name, String description, String location, int duration,int resolution) {
        super(name, description, location, duration);
        if (resolution == 240 || resolution == 320 || resolution == 480 || resolution == 1080 || resolution == 1440 || resolution == 1920 || resolution == 2048) {
            this.resolution = resolution;
        } else {
            this.resolution = -1;
        }
    }

    // accessor and mutator methods
    public int getResolution() {
        return resolution;
    }
    public void setResolution(int resolution) {
        if (resolution == 240 || resolution == 320 || resolution == 480 || resolution == 1080 || resolution == 1440 || resolution == 1920 || resolution == 2048) {
            this.resolution = resolution;
        } else {
            this.resolution = -1;
        }
    }

    // override toString method
    public String toString() {
        if (resolution == -1) {
            return "#" + id + ":" + name + 
            "\n" + description + 
            "\n" + location + 
            "\nDuration: " + duration/1000 + " seconds" +
            "\nResolution: Unknown resolution";
        } else {
        return "#" + id + ":" + name + 
        "\n" + description + 
        "\n" + location + 
        "\nDuration: " + duration/1000 + " seconds" +
        "\nResolution: " + resolution;}
    }
}
