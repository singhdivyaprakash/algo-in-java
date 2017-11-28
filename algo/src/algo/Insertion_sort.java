package algo;
public class Insertion_sort {
  static int[] array;
  static void sort(){
      int temp;
      for(int i=1;i<array.length;i++){
          for(int j=i-1;j>=0;j--){
          if(array[j+1]<array[j]){
              temp=array[j+1];
              array[j+1]=array[j];
              array[j]=temp;
              continue;
              
          }
          else{
              break;
          }
      }
      }
  }
  public static void main(String args[]){
      array=new int[]{100,105,2,-3,441,05,6,7,1};
      sort();
      for(int x:array){
          System.out.println(x);
      }
  }
}
