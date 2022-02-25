package ArrayCodelab;

import java.util.Random;
import java.util.Scanner;

public class ArrayCodelab {
    public static void main(String[] args) {new ArrayCodelab().findSpecificNumber();}

    void averageValue(){
        Random random = new Random();
        int[] myArray;
        myArray = new int[9];
        for (int i=0; i<myArray.length; i++){
            myArray[i] = random.nextInt(10)+1;
            System.out.print(myArray[i] + " ");
        }
        double total=0;
        for (int i : myArray){
            total = total+i;
        }
        total = total/myArray.length;
        System.out.printf("%nAverage: %.2f", total);
    }
    void findSpecificCharacter(){
        Random random = new Random();
        char searchChar;
        searchChar = (char)(random.nextInt(26)+'a'); //fra unicode af a og 26 tal frem for alle 26 bogstaver
        char[] myArray;
        myArray = new char[20];
        System.out.println("The random string: ");
        for (int i=0; i<myArray.length; i++){
            char randomChars = (char)(random.nextInt(26)+'a');
            myArray[i] = randomChars;
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\nSearches for: "+searchChar);

        int counter=0;
        for (int i=0; i<myArray.length; i++){
            if (myArray[i] == searchChar){
                counter++;
            }
        }
        System.out.println("Antal gentagelser: " + counter);
    }

    void findSpecificNumber (){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int searchNum;
        int[] myArray;
        myArray = new int[20];

        System.out.print("What number between 1-9 do you want to search for? ");
        searchNum = sc.nextInt();
        System.out.println("The random number array: ");

        for (int i=0; i<myArray.length; i++){
            myArray[i] = random.nextInt(9)+1;
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\nSearches for: " + searchNum);

        System.out.println("With that number not printed: ");
        for (int i : myArray){
            if (i != searchNum){
                System.out.print(i+" "); //her kan man bruge foreach da man ikke modificere array'en
            }
        }
        System.out.println("\nWith that number removed from the array: ");
        for (int i=0; i<myArray.length; i++){
            if (myArray[i] == searchNum){
                for (i=myArray[i]; i<myArray.length-1; i++) {
                    myArray[i] = myArray[i + 1];
                    System.out.print(myArray[i]+" ..");
                }
            }
            System.out.print(myArray[i]+" --");
        }
    }
    void git (){
        //test commit
        //test commmit to, commit kun .java filen
        //java-klassefilen laves en ny hver gang man åbner så den er ligegyldig at gemme
        //de andre filer er IntelliJ-specifikke så de er bare irriterende,
        //og hvis folk der ikke bruger intellij downloader dem er det irriterende

        //lav ny fil i roden (aller yderste mappe) som hedder .gitignore. Læg disse under:
        //out/ - .class er under her
        //.idea/ - .xml er under her
        //*.iml
        //de her tre dækker over alle de ting der ikke skal med
        //man comitter ikke kode man ikke ved om virker!
        //dog skal man dele noget der ikke virker med andre må man committe og push til github
    }

    boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

}
