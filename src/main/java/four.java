public class four {
    public static void main(String[] args) {
        System.out.println(Range());
    }
    public static Double Range(){
        double n = 2;
        double m = 1 / ((n * n) + n - 2);
        double s = 0;
        while (m >= 0.000001) {
            m = 1 / ((n * n) + n - 2);
            n += 1;
            s += m;
        }
        return s;
    }
}
