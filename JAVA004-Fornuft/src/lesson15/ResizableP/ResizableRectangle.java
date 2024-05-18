package lesson15.ResizableP;

public class ResizableRectangle implements Resizable{
    private double width;
    private double height;

    public ResizableRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize() {
        this.width *= 5;
        this.height *= 5;
        System.out.println("Resized Rectangle: Width = " + this.width + ", Height = " + this.height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
