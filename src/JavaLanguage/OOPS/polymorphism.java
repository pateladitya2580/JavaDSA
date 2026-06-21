package JavaLanguage.OOPS;
/*
Polymorphism ka matlab hai "One Name, Many Forms". Isme ek hi method ya
interface alag-alag objects ya situations ke according alag behavior dikhata hai.
 */
public class polymorphism {
    public static class Dog{
        static void speak(){
            System.out.println("bhau bhau");
        }
    }
    public static class pikachu {
        static void speak(){
            System.out.println(" pika pika ");
        }
    }
    public static class Human{
        static void speak(){
            System.out.println("Hello");
        }
    }
    static void main(String[] args) {
        Dog tommy = new Dog();
        pikachu P = new pikachu();
        Human parag =  new Human();
        tommy.speak();
        pikachu.speak();
        Human.speak();
    }
}
