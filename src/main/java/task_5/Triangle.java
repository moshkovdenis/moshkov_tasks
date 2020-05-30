package task_5;

public class Triangle extends Figure {

    @Override
    public int area(int width,int height) {
        return (width * height) / 2;
    }

    @Override
    public int perimeter(int side, int side2, int side3) {
        return  side + side2 + side3;
    }
}
