import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {new ArrayDemo().refuelArray();}
    int f; //attribut, instansvariabel, det er javas "globale" variabel

    void refuel (){
        int refuel1 =27;
        int refuel2 =38;
        int refuel3= 4;
        int refuel4 =40;
        int total = 0;

        if (refuel1 >= 40){
            System.out.println("Warning");
        }//gøres med hver

        total = refuel1+refuel2+refuel3+refuel4;

        System.out.println(refuel1); //gøres med alle

        System.out.println(total);
    }

    //samme kode gøres med array:
    void refuelArray (){
        int[] refuel; //første side reservere ikke array pladser, det er en reference/pegepind
        //den indeholder hukommelsesladsen, fx fc2a4. Den fylder altid det samme, 8 bytes.
        refuel = new int[4];  //her laves array'en
        //java har ikke pointers, kun referencer. C++ har begge

        refuel[0]=23; //plads 0 er nu 23
        refuel[1]=38;
        refuel[2]=4;
        refuel[3]=40; //det er i sig selv ikke mere simpelt end tidligere

        int total=0;

        for (int i =0; i <4; i++){
            System.out.printf("Week %d: %d litres.\n", i+1, refuel[i]); //i+1 for at den skriver 1-3
        }
        for (int i=0; i < refuel.length; i++){ //i er lokal til for loop selvom det teknisk set ikke er inde for {}
            total += refuel[i]; //+= lægger højresiden til venstresiden
        }
        System.out.println("Total: " + total); //total er tidligere defineret så den har scope i metoden
    }
    //attribute, array.length er en attribut, det er en public final int. Den høre til klassen Array (java.util.Array)
    //den fungere som en metode men det er en konstant der laves når man laver et array


}
