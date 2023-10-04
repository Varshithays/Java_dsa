package varshitha;


import java.util.Scanner;

public class Linearsearch {

    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int[] nums={23,45,6,7,8,99,88,23,45,47};
        int target=237;
        boolean ans=linearsearch3(nums,target);
        System.out.println(ans);

    }
    //search target return true or false if it sis found

    static boolean linearsearch3(int[] arr,int target){
        if(arr.length==0){
            return false;
        }

        for(int index=0;index<arr.length;index++){
            //check for element at every index if it is a target
            int ele=arr[index];
            if(ele==target){
                return true;
            }
        }

        //this line will execute if non of the return above is not executed
        return  false;
    }

    //Search the target and return element

    static int linearsearch2(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        for(int index=0;index<arr.length;index++){
            //check for element at every index if it is a target
            int ele=arr[index];
            if(ele==target){
                return ele;
            }
        }

        //this line will execute if non of the return above is not executed
        return Integer.MAX_VALUE;
    }
    //search array return index if found
    static int linearsearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        for(int index=0;index<arr.length;index++){
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
