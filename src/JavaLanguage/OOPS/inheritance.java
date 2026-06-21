package JavaLanguage.OOPS;

public class inheritance {
    static class Pokemoon{
        int power;
        String type;
        Pokemoon(String type,int power){
            this.power = power;
            this .type = type;
        }
        Pokemoon(){}
        void print(){
            System.out.println(power+" "+type);
        }
    }
    static class LegendaryPokemon extends Pokemoon{
        String ability;
    }

    static void main(String[] args) {
        LegendaryPokemon mewtwo = new LegendaryPokemon();
        mewtwo.ability = "Pressure";
    }
}
/*
Inheritance Java ka ek OOP concept hai jisme ek class dusri
class ke variables aur methods ko inherit (acquire) karti hai.
Isse code reusability badhti hai aur inheritance extends
keyword ki madad se implement ki jati hai.
 */