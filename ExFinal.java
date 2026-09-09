public class ExFinal {
    static final float pi =3.14F;//Final variable cannot be changed
    final class Animal{//cannot extend this class 
        void sound(){
            System.out.println("Animal Makes sounds");
        }
    }
    class Cat{
        final void walk(){//this is the final method it cannot be overridden
            System.out.println("cat walks on four legs");
        }
    }
    public static void main(String[] args) {
        ExFinal obj = new ExFinal();

        Animal a = obj.new Animal();
        Cat c = obj.new Cat();
        System.out.println(pi);
        a.sound();
        c.walk();
        


    }
}
