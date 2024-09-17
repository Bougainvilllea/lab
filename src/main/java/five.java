public class five {
    public static void main(String[] args) {
        String s = "1231";
        System.out.print(MakeInstall(s));
    }

    public static Boolean MakeInstall(String s) {
        String installmake = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            installmake += s.charAt(i);

        }
        return installmake.equals(s);
    }
}
