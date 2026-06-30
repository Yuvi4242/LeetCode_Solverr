class Solution {
    public int[] asteroidCollision(int[] ass) {
         Stack<Integer> s=new Stack<>();
         for(int i=0;i<ass.length;i++){
            int curr=ass[i];
            boolean destroyed=false;
            while(!s.isEmpty()&&s.peek()>0&&curr<0){
                int top=s.peek();
                
                if(Math.abs(top)<Math.abs(curr)){
                    s.pop();
                }
                else if(Math.abs(top)==Math.abs(curr)){
                    s.pop();
                    destroyed=true;
                    break;
                }
                else{
                    //s.pop();
                    destroyed=true;
                    break;
                }
            }
            if(!destroyed){
                s.push(curr);
            }
         }
    int[]ans=new int[s.size()];
    for(int i=s.size()-1;i>=0;i--){
        ans[i]=s.pop();
          }
         
        return ans;
    }
}