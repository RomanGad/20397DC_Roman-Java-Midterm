package math_problems;

public class LowestNumber {

    /** INSTRUCTIONS
     * Write a method to find the lowest number from this array.
     */

    public static void main(String[] args) {

       int[] array = new int[] {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123,
               67, 5, 679, 54, 32, 65};
       int []low =array;
       int temp, size;

       size = array.length;
       for(int i= 0; i<size; i++){
           for (int n=i+1; n<size; n++){
               if(low[i]>low[n]){
                   temp=low[i];
                   low[i]= low[n];
                   low[n]= temp;
               }
           }
       }
       System.out.println("The lowest number of this array list is: " + low[0]);







   }

}
