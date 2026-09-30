package Assignments.Assignment3;

public class StaticContent extends Content {
    public String author;

    public StaticContent(String name, String description, String location, String author) {
        super(name, description, location);
        if (author == null || author.isEmpty()) {
            this.author = "Unknown author";
        } else {
            this.author = author;
        }
    }

    // accessor method
    public String getAuthor() {
        return author;
    }
    // mutator method
    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            this.author = "Unknown author";
        } else {
            this.author = author;
        }
    }

    // override toString method
    public String toString() {
        return "#" + id + ":" + name + "\n" + description + "\n" + location + "\n by " + author;
    }
    
}
