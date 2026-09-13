class Solution {
    public int findPoisonedDuration(int[] timeSeries, int d) {
        if(timeSeries.length==0 || d==0){
            return 0;
        }
        int total=0;
        for(int i=0;i<timeSeries.length-1;i++){
           total+=Math.min((timeSeries[i+1]-timeSeries[i]),d);
        }
        return total+d;
    }
}