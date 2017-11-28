
package algo;
public class Recurse {
    static int search(int[] a,int i, int x){
        if(i<=a.length-1){
            if(a[i]==x){
                return i;
            }
            else{
               return (search(a,i+1,x)) ;
            }
        }
        return -1;
    }
    public static void main(String args[]){
       int[] b=new int[]{1,2,5,6,6,1,5,1561,1651,65,165,65,1651,651,65,11,651,651,651,561,651,55168916};
       System.out.println(search(b,0,16515555));
    }
}
