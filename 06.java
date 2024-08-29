public class RecursionExample {
    public static int h(int m, int n) {
        if (n == 1) {
            return m + 1;
        } else if (m == 1) {
            return n + 1;
        } else {
            return h(m, n - 1) + h(m - 1, n);
        }
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int result = h(m, n);
        System.out.println("O resultado de h(" + m + ", " + n + ") é: " + result);
    }
}
