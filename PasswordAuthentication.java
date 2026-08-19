public class PasswordAuthentication {
    public static void passverifyBruteForce(String s){
        int n=s.length();
        boolean upper=false;
        boolean lower=false;
        boolean digit=false;
        boolean special=false;
        if(n>=8){
            for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(Character.isUpperCase(ch)){
                    upper =true;
                }
                else if(Character.isLowerCase(ch)){
                    lower=true;
                }
                else if(Character.isDigit(ch)){
                    digit=true;
                }
                else{
                  special=true;
                }
                if(upper&&lower&&special&&digit){
                    break;
                }
               
            }

        }
        else{
            System.out.println("The minimum length of string must be 8 ");
        }
        if(upper==true&&lower==true&&digit==true&&special==true){
            System.out.println("String is valid");
        }
        else{
            System.out.println("Password should have atleast 1 uppercase 1 lowercase 1 digit and 1 special character ");
        }
    }

    
    public static void main(String[] args) {

        String s="Hello@123";
        passverifyBruteForce(s);
        
    }
    
}
