import java.util.*;
public class Main{
    
  //Function to find minimum difference of subarrays
    static int mindiff(int arr[], int k){
        if(arr.length==0 || k==0){
            return 0;
        }
        if(arr.length<k){
            return -1;
        }
        
        int mindifff= Integer.MAX_VALUE;
        for(int i=0; i+k-1<arr.length; i++){
            int diff= arr[i+k-1] - arr[i];
            if(mindifff>diff){
                mindifff= diff;
            }
        }
        return mindifff;
    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] arr= {7, 3, 2, 4, 9, 12, 56};
        int k= sc.nextInt();
        Arrays.sort(arr);
        System.out.print("min diff is= "+ mindiff(arr,k));
    }
}
