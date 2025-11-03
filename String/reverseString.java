class reverseString {
    public static String rev(String str) {
        StringBuilder sb = new StringBuilder();
        return sb.append(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str = "Milan";

        // 1
        // String rev = "";
        // for (int i = 0; i < str.length(); i++) {
        // rev = str.charAt(i) + rev;
        // }
        // System.out.println(rev);

        // 2
        // for (int i = str.length() - 1; i >= 0; i--) {
        // System.out.print(str.charAt(i));
        // }
        // System.out.println();

        // 3
        // System.out.println(new StringBuilder(str).reverse());

        // 4
        System.out.println(rev(str));
    }
}
