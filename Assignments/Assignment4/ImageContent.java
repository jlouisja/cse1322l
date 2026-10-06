package Assignments.Assignment4;

public class ImageContent extends StaticContent implements WideScreenSupport{
    public int width;
    public int height;
    public String widescreenMessage;
    public boolean hasWideScreenSupport() {
        return (double) width / height >= 1.5 && (double) width / height < 2.0;
    }

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
        if (this.hasWideScreenSupport()) {
            widescreenMessage = "Has wide screen support.";
        } else {
            widescreenMessage = "No wide screen support.";
        }
        return "#" + id + ":" + name + "\n" + description + "\n" + location + "\nby " + author + "\n" + width + "x" + height + "\n" + widescreenMessage;
    }
}
