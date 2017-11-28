
package algo;
import java.util.Scanner;
public class LinerSearch {
   static int[] array;
   static int value;
   static int search(int key){
       for(int i=0;i<array.length;i++){
           if(array[i]==key){
               return i;
           }
           
       }
       System.out.println("result no found");
       return -1;
   } 
   public static void main(String args[]){
       LinerSearch ls=new LinerSearch();
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the length of the array");
       int length=scan.nextInt();
       array=new int[length];
       for(int i=0;i<length;i++){
           System.out.println("enter");
           int ele=scan.nextInt();
           array[i]=ele;
       }
       System.out.println("enter the element to search");
       int key=scan.nextInt();
       System.out.println(search(key));
   }
}
