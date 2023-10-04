package varshitha;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class Findevennodigits {
        public static void main(String[] args){
           int[] nums = {1,345,2,6,7896};
            System.out.println(findnumbers(nums));

            System.out.println(digits2(-122));

        }
    static int findnumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits= digits(num);
       // if(numberOfDigits%2==0){}
            return numberOfDigits%2==0;

    }
    //no conatians even or  not
    static int digits(int num){
            if(num<0){
                num=num*-1;
            }
            if(num==0){
                return 1;

            }
        int count=0;

        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

    static int digits2(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;

        }
            return (int)(Math.log10(num)) + 1;
    }
}
