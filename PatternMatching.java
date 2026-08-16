public class PatternMatching {
    public static void main(String[] args) {
        String s1="abcxyspqrlmnp";
        if(s1.contains("pqr")){
            System.out.println("Index is :" +s1.indexOf("pqr"));
        }
        else{
            System.out.println("Not found");
        }
    }
}
