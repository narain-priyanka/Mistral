class Solution {

    List<List<Integer>>main=new ArrayList<>();

    void convert(int[][]graph,int index,List<Integer>ans){

    if(index==graph.length-1){
        ArrayList<Integer> gfg2 = new ArrayList<>(ans);
        main.add(gfg2);
        return;
    }


    for(int i=0;i<graph[index].length;i++){

    ans.add(graph[index][i]);
    convert(graph,graph[index][i],ans);
    ans.remove(ans.size()-1);
    }

    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

    List<Integer>ans=new ArrayList<Integer>();

    ans.add(0);

    convert(graph,0,ans);

    return main;

    }
}