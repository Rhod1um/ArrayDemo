package ArrayCodelab;

import java.util.Random;

public class ArrayW3 {

    boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    void tal(){
        Random random = new Random();
        int searchNum=7;
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
        int[] myarray1 = new int[3];
        //myarray1[0]= random.nextInt(3)+1;
        //myarray1[1]= random.nextInt(3)+1;
        //myarray1[2]= random.nextInt(3)+1;

        for (int i=0; i<myarray1.length; i++){
            myarray1[i]= random.nextInt(3)+1;
            System.out.print(myarray1[i]+" ");
        }
        /*int u=0;
        for (int i : myarray1){
            myarray1[u] = random.nextInt(3)+1;
            System.out.print(myarray1[u]+" ");
        } */
        //et foreach loop kan ikke modificere array'en. 'i' er en lokal variabel, ikke en reference.
        //så 'i' kan ikke bruges i stedet for u her.
        //Normal forloop er bedre her.
        System.out.println();
        System.out.println(myarray1[0] + myarray1[1] + myarray1[2]);
        System.out.println(contains(myarray1, 2));
        System.out.println(contains(myarray1, 8));
    }

    public static void main(String[] args) {new ArrayW3().tal();}

}
