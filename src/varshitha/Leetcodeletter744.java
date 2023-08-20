package varshitha;

//Ceiling means smallest no greater than equal to target
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Leetcodeletter744 {
    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;



        //int mid = 0;
        while (start <= end) {
            //find middle
            //mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return letters[start% letters.length];

    }
    //return index
}

