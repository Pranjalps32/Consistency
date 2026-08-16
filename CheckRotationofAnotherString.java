public class CheckRotationofAnotherString {
    public static void main(String[] args) {
        String s1="waterbottle";
        String s2="erbottlewat";

        if(s1.length() == s2.length() && (s1 + s1).contains(s2)) {
             System.out.println("Strings are rotations");
            }
        else {
                 System.out.println("Strings are not rotations");
             }
    }    
}
