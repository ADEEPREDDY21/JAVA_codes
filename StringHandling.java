public class StringHandling {
    public static void main(String[] args) {
        String str1 = "Aditya";
        String str2 = "aditya";
        String str3 = "Adi";
        boolean x = str1.equals(str2);
        System.out.println("Compare str1 and str2: " + x);
        System.out.println("Character at given position is: " + str1.charAt(2));
        System.out.println(str1.concat(" The author"));
        System.out.println(str1.length());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.substring(0, 4));
        System.out.println(str1.substring(4));
    }
}
