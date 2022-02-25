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
        //skal man slette et commit skal man gå ned i log og højre-klikke på
        //enten den nyeste commit og trykke undo commit, og hvis man vil slette alle
        //commits efter et bestemt commit skal man trykke Reset current branch to here
        //for begge skal man op i git og trykke uncommited changes -> rollback efterfølgende
        //man kan ikke redo
        //revert sammenfletter en tidligere og nyere funktion. Umiddelbart går den bare tilbage til
        //den tidligere funktion hvis der ikke er nogen konflikter. Man kan bruge det hvis man vil sammenflette
        //tidligere commits
        //reset sletter alt. Reset hard sletter alt
        //soft reset sletter historikken men ikke filerne. Koden er den samme. Så man committer det samlet
        //reset keep beholder det der ikke er committed - bruges ikke rigtig

        //github
        //origin er bare navnet på remote repository, som bare er repository uden for ens computer (her github)
        //alternativer til github, gitlab, bitbucket, azure devops osv. De er alle projekstyringsprogrammer
        //ud over at være remote repository
        //push skubber ens repositiry ud, pull trækker det tilbage
        //clone tager nyt projekt fra remote repository. Noget man ikke selv har lavet
        //collaborators - folk med adgang til ens remote repository, de kan pushe. Alle kan pulle.
        //det er fuld adgang eller ingen. Man kan ikke bestemme hvilke mapper
        //fetch henter ikke filerne, men kigger om noget ligger der
        //update i intellij gør det hele
        //commit ofte men push når det er nødvendigt
        //commit så snart man har oprettet projektet. Det giver tidslinje for projektet
        //underviserne kan se tidspunkter for commit og de vil se man har committed regelmæssigt
        //amend gør at den nye commit er i den tidligere i historikken, så man ikke får
        //en masse commits i historikken
        //for at hente en andens projekt skal man lave en ny og new -> open project with version control
        //trykke push på den blå nedadgående pil i højre hjørne. Man kan vælge at hente den andens
        //nyeste version (lægges lige før ens egen hvis man selv har ændret i den)
        //eller trykke merge som tager de nye ændringer ind i den seneste version
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
