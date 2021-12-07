import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EndlessIntArray x = new EndlessIntArray();
        x.add(2);
        x.add(3);
        System.out.println(Arrays.toString(x.toArray()) + " " + x.getLength() + " " + x.getCapacity());
        x.add(4);
        System.out.println(Arrays.toString(x.toArray()) + " " + x.getLength() + " " + x.getCapacity());
        x.toStart(5);
        System.out.println(Arrays.toString(x.toArray()) + " " + x.getLength() + " " + x.getCapacity());
    }
}
