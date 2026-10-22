public class ComparableCircle extends Circle {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(GeometricObject other) {
        if (other instanceof ComparableCircle) {
            ComparableCircle circle = (ComparableCircle) other;
            return Double.compare(
                    this.getRadius(),
                    circle.getRadius()
            );
        }

        return super.compareTo(other);
    }

    public static ComparableCircle max(
            ComparableCircle first,
            ComparableCircle second) {
        return first.compareTo(second) >= 0 ? first : second;
    }
}
