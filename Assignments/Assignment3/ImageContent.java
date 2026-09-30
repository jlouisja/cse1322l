package Assignments.Assignment3;


public class ImageContent extends StaticContent {
    public int width;
    public int height;

    public ImageContent(String name, String description, String location, String author,int[] dimensions) {
        super(name, description, location, author);
        this.setDimensions(dimensions);
    }

    public int[] getDimensions() {
        return new int[]{width, height};
    }

    public void setDimensions(int[] dimensions) {
        if (dimensions.length != 2) {
            this.width = 0;
            this.height = 0;
        } else {
            this.width = dimensions[0];
            this.height = dimensions[1];
        }
    }

    // override toString method
    public String toString() {
        return "#" + id + ":" + name + "\n" + description + "\n" + location + "\nby " + author + "\n" + width + "x" + height;
    }
}
