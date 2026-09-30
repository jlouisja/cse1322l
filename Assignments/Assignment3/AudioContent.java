package Assignments.Assignment3;

import java.util.ArrayList;

public class AudioContent extends DynamicContent {
    public ArrayList<String> participants;

    public AudioContent(String name, String description, String location, int duration, ArrayList<String> participants) {
        super(name, description, location, duration);
        this.participants = participants;
    }

    // accessor and mutator methods
    public ArrayList<String> getParticipants() {
        return participants;
    }
    public void setParticipants(ArrayList<String> participants) {
        this.participants = participants;
    }

    // list participants on separate lines
    public String listParticipants(){
        if (participants.size() == 0) {
            return "Unknown participants";
        } else {
            StringBuilder sb = new StringBuilder();
            for (String participant : participants) {
                sb.append(participant).append("\n");
            }
            return sb.toString();
        }
    }

    // override toString method
    public String toString() {
        return "#" + id + ":" + name + 
        "\n" + description + 
        "\n" + location + 
        "\nDuration: " + duration/1000 + " seconds" +
        "\nParticipants:\n" + listParticipants();
    }
}
