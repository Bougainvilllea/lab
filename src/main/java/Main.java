public class Main {
    public static void main(String[] args) {
        Button click = new Button();
        click.click();
        click.click();
        click.click();

        Balance result = new Balance();
        result.addRight(2);
        result.addLeft(3);
        result.result();

        Bell sound = new Bell();
        sound.sound();
        sound.sound();
        sound.sound();

        OddEvenSeparator nubers = new OddEvenSeparator();
        nubers.addNumber(3);
        System.out.println(nubers.even());
        System.out.println(nubers.odd());
    }
}
