import java.util.Scanner;

public class Fridge {
    public static void main(String[] args) {new Fridge().arrayTestKøleskab();}

    void arrayTestKøleskab(){
        Scanner sc = new Scanner(System.in);
        String[] foods; //navngiv array i flertal, det her er bare reference. Array er ikke lavet endnu
        int numFoods;

        numFoods = askUserHowManyFoods();
        foods = askUserToInputFoods(numFoods);
        printList(foods);
    }

    int askUserHowManyFoods(){
        Scanner sc = new Scanner(System.in);
        int numberOfFoods;
        System.out.print("How many foods? ");
        sc.nextLine(); //for at gå fra int til String i scanner. Scanner bug (det er ikke en bug)
        numberOfFoods = sc.nextInt();
        return numberOfFoods;
    }


    String[] askUserToInputFoods(int num){ //returtype er String[]
        Scanner sc = new Scanner(System.in);
        String[] inputFoods=new String[num];

        for (int i=0; i<num; i++){
            System.out.println("Enter food #" + (i+1) + ": "); //i+1 så den ikke starter på 0
            inputFoods[i]=sc.nextLine();
        }
        return inputFoods;
    }

    void printList(String[] foods){
        System.out.println("\nLIST OF FOOD: ");

        for (int i =0; i<foods.length; i++){
            System.out.println("#" + i+1 +": " + foods[i]);
        }
    }

}

//returnere man array returnere den referencen/alias, ikke array'et
