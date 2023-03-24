import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] massive = new int[]{1, 2, 3, 4, 5,3,2,2,1};
        int[] massive1 = new int[massive.length];
        int counter = 0;
            for (int i = 0; i < massive.length; i++) {
                while (true) {
                    int array = random.nextInt(10);
                    if (massive[i] == array) {
                        massive1[i] = array;
                        break;
                    }
                }
                counter++;
            }
        System.out.println(counter);
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
        System.out.println("\n-----------------------------");
                for (int i = 0; i < massive1.length; i++) {
                    System.out.print(massive1[i]+" ");
                }

    }
}
