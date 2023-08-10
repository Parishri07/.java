// import java.util.*;


//compare each element from start with other elements and exchange with the smallest
public class selection_sort {

    public static int[] selectionSort(int a[]){
         int i,j,p;
       //time complexity = o(n^2)
        //1 swap for 1 iteration
        for(j=0;j<=4;j++){
          int min = a[j];
          p=j;
          for(i=j+1;i<=4;i++){
            if(a[i]<min){
              min = a[i];
              p=i;
            }
          }
            int tmp = a[j];
            a[j] = a[p];
            a[p] = tmp;
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[] = {3,9,1,8,6};
        arr = selectionSort(arr);
        for(int k=0;k<=4;k++)
         System.out.print(arr[k]+" ");
    }
}
