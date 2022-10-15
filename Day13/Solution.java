class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> mainList = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            list=new ArrayList<>(temp); 
            temp=new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    temp.add(1);
                }else{
                    int ans=list.get(j-1) + list.get(j);
                    temp.add(ans);
                }
            }
            
            mainList.add(new ArrayList<>(temp));
        }
        return mainList;
    }
}
