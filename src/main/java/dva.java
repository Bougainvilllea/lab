public class dva {
    public static void main(String[] args) {
        String s = "make install";
        System.out.print(MakeInstall(s));
    }

    public static String MakeInstall(String s) {
        String installmake = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            installmake += s.charAt(i);

        }
        return installmake;
    }
}
