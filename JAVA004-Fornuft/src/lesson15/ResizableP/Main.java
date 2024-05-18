package lesson15.ResizableP;

public class Main {
    public static void main(String[] args) {
        ResizableRectangle rectangle = new ResizableRectangle(100, 50);
        System.out.println("Original Rectangle: Width = " + rectangle.getWidth() + ", Height = " + rectangle.getHeight());
        rectangle.resize();
    }
}
