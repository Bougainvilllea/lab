import java.util.ArrayList;

public class OddEvenSeparator {
    ArrayList<Integer> list_even = new ArrayList<>();
    ArrayList<Integer> list_odd = new ArrayList<>();

    public void addNumber(int number) {
        if (number % 2 == 0) {
            list_even.add(number);
        }
        else {
            list_odd.add(number);
        }
    }
    public ArrayList<Integer> even(){
        return list_even;
    }
    public ArrayList<Integer> odd(){
        return list_odd;
    }
}
