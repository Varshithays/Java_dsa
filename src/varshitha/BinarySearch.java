package varshitha;

public class BinarySearch {
    public static void main(String[] args){
        int [] arr={2,3,4,5,6,8,12,14,56,78,90};
        int target=2;
        int ans=Binarysearch(arr,target);
        System.out.println(ans);
    }


    //return index
    static int Binarysearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        //int mid = 0;
        while (start <= end) {
            //find middle
            //mid = (start + end) / 2;
           int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }

        }
        return -1;

    }
}
