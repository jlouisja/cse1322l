package Assignments.Assignment4;

public class WrittenContent extends StaticContent {
    public int words;

    public WrittenContent(String name, String description, String location, String author,int words) {
        super(name, description, location, author);
        if (words < 0) {
            this.words = 0;
        } else {
            this.words = words;
        }
    }

    // accessor and mutator methods
    public int getWords() {
        return words;
    }
    public void setWords(int words) {
        if (words < 0) {
            this.words = 0;
        } else {
            this.words = words;
        }
    }
    
    // read time method
    public String getReadTime() {
        int readTime = words / 180;
        if (readTime < 1) {
            return "Less than a minute";
        } else if (readTime == 1) {
            return "Around 1 minute";
        } else {
            return "Around " + readTime + " minutes";
        }
    }

    // override toString method
    public String toString() {
        return "#" + id + ":" + name + "\n" + description + "\n" + location + "\nby " + author + "\nRead time: " + getReadTime();
    }
    
}
