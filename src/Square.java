public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
        this(0);
    }

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side < 0) {
            throw new IllegalArgumentException(
                    "Сторона квадрата не может быть отрицательной");
        }
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public int compareTo(GeometricObject other) {
        return Double.compare(getArea(), other.getArea());
    }

    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны.");
    }

    @Override
    public String toString() {
        return "Квадрат: сторона = " + side
                + ", площадь = " + getArea();
    }
}

