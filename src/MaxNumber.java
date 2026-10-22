
public class MaxNumber {
    public static void main(String[] args) {
        int a = 12;
        int b = 25;
        int c = 18;

        int max = Math.max(a, Math.max(b, c));

        System.out.println("Максимальное число: " + max);
    }
}
