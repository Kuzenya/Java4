import java.util.Date;

public class GeometricObject implements Comparable<GeometricObject> {
    private String color = "white";
    private boolean filled;
    private final Date dateCreated = new Date();

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public int compareTo(GeometricObject other) {
        return Double.compare(getArea(), other.getArea());
    }

    public double getArea() {
        return 0.0;
    }

    public String toString() {
        return "Цвет: " + color
                + ", заполнен: " + filled
                + ", дата создания: " + dateCreated;
    }

    public static GeometricObject max(
            GeometricObject first, GeometricObject second) {
        return first.compareTo(second) >= 0 ? first : second;
    }
}
