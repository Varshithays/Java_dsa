package varshitha;

//Ceiling means smallest no greater than equal to target

public class CeilingBS {
    public static void main(String[] args){
        int [] arr={2,3,5,9,14,16,18};
        int target=15;
        int ans=Ceiling(arr,target);
        System.out.println(ans+":"+arr[ans]);
    }


    //return index
    static int Ceiling(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target>arr[arr.length-1]){
            return -1;
        }

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
        return start;

    }
}
