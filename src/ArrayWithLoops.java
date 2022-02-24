public class ArrayWithLoops {
    public static void main(String[] args) {new ArrayWithLoops().go();}

    void go(){
        int[] myArray = {17,3,-2,10,4};
        for (int i=0; i<myArray.length; i++) {
            System.out.print(myArray[i] + " ");
            myArray[2] = 0; //sætter tredje element til 0
        }
        System.out.println();
        int i=0;
        while (myArray[i] != 10){ //køre indtil den rammer 10 i et index
            System.out.print(myArray[i]+" ");
            i++;
        }
        System.out.println();
        while (i<myArray.length && myArray[i] != 10){ //skal ikke printe 10 men køre videre efter
            System.out.println(i);
        }
        //enhanced for-loop, eller for each
        System.out.println("\nEnhanced for loop");
        for (int j : myArray){ //j er reference til elementerne i arrayet. Det står i stedet for myArray[j]
            System.out.print(j +" "); //derfor kan j være i stedet for myArray[j]. Det er en reference, ikke variabel
        } //enhanced for loop er begrænset i dens funktioner. Den gør kun dette. Man kan ikke ændre hvordan det køre,
          // fx kan ikke ændre hvor den starter og slutter, om den skal springe indexes over osv
        //virker på alle typer af lister. Array er kun et eksempeltype liste

        //Array har fast længde, elementer kan ikke fjernes eller tilføjes. Man skal lave et nyt et
        //som er længere og skal have kopieret over
        //array kan have flere dimensioner, 2D
    }
}
