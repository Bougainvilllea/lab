public class odin {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++){
            System.out.println(FizzBuzz(i));
        }
    }
    public static String FizzBuzz(int i) {
        String s = "";
            if (i % 7 == 0 && i % 5 == 0) {
                s = "fizzbuzz";
            }
            else if (i % 7 == 0) {
                s = "buzz";
            }
            else if (i % 5 == 0) {
                s = "fizz";
            }
            else {
                s = Integer.toString(i);
            }
        return s;
    }
}