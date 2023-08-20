package varshitha;

public class Maximumwealth {
    public static void main(String[] args){

    }
    public int maximumwealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            //new sum for every column
            int rowsum=0;
            for (int account = 0; account <accounts[person].length ; account++) {
                rowsum+=accounts[person][account];

            }
            if(rowsum>ans){
                ans=rowsum;
            }

        }
        return ans;

    }
}
