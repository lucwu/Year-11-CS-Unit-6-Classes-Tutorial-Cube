public class Cube {
    private int side;

    public Cube() {
        side = 1;
    }

    public Cube(int side) {
        this.side = side;
        if (side < 1) {
            throw new IllegalArgumentException("Value less than 1");
        }
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
        if (side < 1) {
            throw new IllegalArgumentException("Value less than 1");
        }
    }

    public int getSurfaceArea() {
        int surfaceArea = side * side * 6;
        return surfaceArea;
    }

    public int getVolume() {
        int volume = side * side * side;
        return volume;
    }

    public String toString() {
        return ("Side: " + side);
    }
}