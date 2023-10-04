package varshitha;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastPosition34 {
    public static void main(String[] args){

    }
    public int[] searchRange(int[] nums, int target)
    {
        int[] ans={-1,-1};

        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        if(ans[0]!=-1){
            ans[1]=search(nums,target,false);
        }


        return ans;


    }

    int search(int[] nums,int target,boolean findstartindex)
    {
        int ans=-1;
        int start = 0;
        int end = nums.length - 1;

        //int mid = 0;
        while (start <= end) {
            //find middle
            //mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans=mid;
                if(findstartindex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}