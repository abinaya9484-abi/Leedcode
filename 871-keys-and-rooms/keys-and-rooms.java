class Solution {
    boolean[] v;
    List<List<Integer>> arr;

    public void dfs(int i){
        if(v[i]) return;
        v[i] = true;
        for(int j : arr.get(i)) dfs(j);
    }

    public boolean canVisitAllRooms(List<List<Integer>> arr) {
        this.arr = arr;
        this.v = new boolean[arr.size()];
        dfs(0);
        for(boolean b : v) if(!b) return false;
        return true;
    }
}