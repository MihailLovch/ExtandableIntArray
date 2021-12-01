import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EndlessIntArray x = new EndlessIntArray();
        x.add(2);
        x.add(3);
        x.add(4);
        System.out.println(Arrays.toString(x.toArray()));
        int y = x.remove(1);
        System.out.println(y);
        System.out.println(Arrays.toString(x.toArray()));
        System.out.println(x.indexOf(2));

    }
}
