public class queue {
    public static void main(String[] args) {
        int n, a, b;
        java.util.Scanner s = new java.util.Scanner(System.in);
        n = s.nextInt();
        a = s.nextInt();
        b = s.nextInt();
        s.close();

        int p = n - Math.max(a + 1, n - b) + 1;
        System.out.println(p);
    }
}
