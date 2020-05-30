package task_5;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.color = "Красный";
        System.out.println("Площадь " + triangle.area(4,5));
        System.out.println("Пириметр " + triangle.perimeter(3,4,7));
        System.out.println("Цвет треугольника " + triangle.color);
    }
}
