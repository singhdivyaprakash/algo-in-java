
package algo;
public class Selection_sort {
   static int[] array;
   static int[] sort(){
       for(int i=0;i<array.length-1;i++){
           int temp=array[i];
           int key=i;
           for(int j=i+1;j<array.length;j++){
              if(temp>array[j]){
                  temp=array[j];
                  key=j;
              } 
           }
           if(temp<array[i]){
               array[key]=array[i];
               array[i]=temp;
           }
       }
       return array;
   }
   public static void main(String args[]){
       array=new int[]{10,9,8,7,6,5,4,3,2,-85};
       sort();
       for(int x:array){
           System.out.println(x);
       }
   }
}
