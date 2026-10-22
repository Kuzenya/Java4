public class TestComparable {

    public static void main(String[] args) {

        Rectangle rectangle1 =
                new Rectangle(4, 5, "Red", true);

        Rectangle rectangle2 =
                new Rectangle(6, 3, "Blue", false);

        GeometricObject largest =
                GeometricObject.max(rectangle1, rectangle2);

        System.out.println("Сравнение прямоугольников:");
        System.out.println("Первый: " + rectangle1);
        System.out.println("Второй: " + rectangle2);
        System.out.println("Объект с большей площадью: " + largest);

        ComparableCircle circle1 = new ComparableCircle(3);
        ComparableCircle circle2 = new ComparableCircle(5);

        System.out.println("\nСравнение окружностей:");
        System.out.println("Первая: " + circle1);
        System.out.println("Вторая: " + circle2);

        int result = circle1.compareTo(circle2);

        if (result < 0) {
            System.out.println("Первая окружность меньше.");
        } else if (result > 0) {
            System.out.println("Первая окружность больше.");
        } else {
            System.out.println("Окружности равны.");
        }

        GeometricObject largestCircle =
                GeometricObject.max(circle1, circle2);

        System.out.println(
                "Окружность с большей площадью: " + largestCircle
        );

        try {
            Triangle triangle = new Triangle(3, 4, 5);
            Circle circle = new Circle(3);

            GeometricObject larger =
                    GeometricObject.max(triangle, circle);

            System.out.println("Объект с большей площадью:");
            System.out.println(larger);

        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());}

    }
}


