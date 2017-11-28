
package algo;
//array should be shorted for it to work
public class Binary_search {
  static int[] array;
  static int key;
  static int bs(){
      int a=0;
      int b=array.length-1;
      int c;
      while(a<=b){
          c=(a+b)/2;
      if(array[c]==key){
          return c;
      }
      else if(array[c]>key){
          b=c-1;
      }
      else{
          a=c+1;
      }
      }
      return -1;
  } 
  public static void main(String args[]){
      array=new int[]{1,2,5,8,45,78,96,105,520,841,4125,9563,45212};
      key=520;
      System.out.println(bs());
  }
}
