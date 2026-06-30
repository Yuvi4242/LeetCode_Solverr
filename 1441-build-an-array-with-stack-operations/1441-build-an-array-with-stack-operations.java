class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:target){
            list.add(num);
        }
        int j=0;
        for(int i=1;i<=n&&j<target.length;i++){
            ans.add("Push");
            if(list.contains(i)){
                j++;
            }
            else{
                ans.add("Pop");
            }
        }
        return ans;
    }
}