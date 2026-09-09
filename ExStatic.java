public class ExStatic {//top level class cant be static
    /*static variable → one shared copy
      static method   → can call without an object
      static nested class → belongs to the outer class */
     static int count=0;//one shared copy is passed 
    static class Animal{//nested class can be static
        static void Sound(){//Static method doesnt need to create an object for calling this method
            System.out.println("Animals make sounds");
        }
        static int increase(){
              return  count++;
        }
    }
    public static void main(String[] args) {
       
        Animal A=new Animal();
         Animal.Sound();
         Animal.increase();

         System.out.println( A.increase());//java allows creating object but its not good practice
         Animal.increase();
         System.out.println( A.increase());
        

    }
    
}
