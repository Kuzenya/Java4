public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = {
                new Square(2),
                new Square(3),
                new Circle(2),
                new Square(4),
                new Circle(3)
        };

        for (GeometricObject object : objects) {
            System.out.println(object);
            System.out.println("Площадь: " + object.getArea());

            if (object instanceof Colorable) {
                ((Colorable) object).howToColor();
            }

            System.out.println("--------------------");
        }
    }
}
