package task_6;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public boolean isSquare() {
        return length == width;
    }
}
