package JavaLanguage.OOPS;

public class constructors {
    public static class Car{
        int seats;
        String name;
        double length;

        //default constructor isse normal object banao phir vlaue dalo

        Car(){

        }

        // constructor isme done kaam ek sath objet ban bhi raha hai or value bhi dal rahi hai
        Car(int seats,String name,double length){
            this.seats  = seats;
            this.name = name;
            this.length = length;
        }

        void print(){
            System.out.println(seats+" "+name+" "+length);
        }
    }
    // default hamesa chalta hai
    static void main(String[] args) {
        Car c1 = new Car(5,"kia Sonet",3.9);
        c1.print();
    }
}
