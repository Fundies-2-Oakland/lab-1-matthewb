public class Main {
    public static void main(String[] args) {
        Vector3D vector = new Vector3D(3.0, 4.0, 5.0);
        System.out.println("Vector: " + vector);

        System.out.println("X Component: " + vector.getX());
        System.out.println("Y Component: " + vector.getY());
        System.out.println("Z Component: " + vector.getZ());

        System.out.println("Magnitude: " + vector.getMagnitude());
    }
}

