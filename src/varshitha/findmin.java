package varshitha;

public class findmin {
    public static void main(String[] args){
        int [] arr={18,12,-7,18,14,5};
      //  int target=-7;
       System.out.println(min(arr));

    }
    static int min(int[] arr){
        int ans=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<ans)
                ans=arr[i];
        }
        return ans;
    }
}
