package varshitha;

public class Searchrange {
    public static void main(String[] args){
        int [] arr={18,12,-7,18,14,5};
        int target=-7;
        System.out.println(linearsearch(arr,target,1,4));

    }

    static int linearsearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }

        for(int index=start;index<end;index++){
            //check for element at every index if it is a target
            int ele=arr[index];
            if(ele==target){
                return index;

            }
        }

        //this line will execute if non of the return above is not executed
        return -1;
    }
}
