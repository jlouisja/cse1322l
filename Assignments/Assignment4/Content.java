package Assignments.Assignment4;

public class Content {
    public String name;
    public String description;
    public String location;
    public int id;
    static int nextId = 1;

    public Content(String name, String description, String location) {
        if (name == null || name.isEmpty()) {
            this.name = "No name";
        } else {
            this.name = name;
        }
        if (description == null || description.isEmpty()) {
            this.description = "No description";
        } else {
            this.description = description;
        }
        if (location == null || location.isEmpty()) {
            this.location = "Unknown location";
        } else {
            this.location = location;
        }
        this.id = nextId++;
    }
    // accessor methods
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getLocation() {
        return location;
    }
    public int getId() {
        return id;
    }

    // mutator methods
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "No name";
        } else {
            this.name = name;
        }
    }
    public void setDescription(String description) {
        if (description == null || description.isEmpty()) {
            this.description = "No description";
        } else {
            this.description = description;
        }
    }
    public void setLocation(String location) {
        if (location == null || location.isEmpty()) {
            this.location = "Unknown location";
        } else {
            this.location = location;
        }
    }

    public String toString() {
        return "#" + id + ":" + name + "\n" + description + "\n" + location;
    }
}
