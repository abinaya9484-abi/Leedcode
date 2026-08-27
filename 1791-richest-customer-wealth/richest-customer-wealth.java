class Solution {
    public int maximumWealth(int[][] accounts) {
        // here person is row
        //and acc is col
        int ans=Integer.MIN_VALUE;
       
        for(int person=0;person<accounts.length;person++){
            int rowsum=0;// r4set sabka karna padega 
            for(int acc=0;acc<accounts[person].length;acc++){
                rowsum+=accounts[person][acc];
            }
        

        if(rowsum>ans){
            ans=rowsum;
        }
        }
        return ans;
    }
}