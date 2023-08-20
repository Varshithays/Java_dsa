package varshitha;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr={22,44,8,4,6,8,12,14,56,78,90};
        int target=4;

        int ans=orderAgnostic(arr,target);
        System.out.println(ans);

    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        boolean isAsc = arr[start] < arr[end];


        //int mid = 0;
        while (start <= end) {
            //find middle
            //mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}