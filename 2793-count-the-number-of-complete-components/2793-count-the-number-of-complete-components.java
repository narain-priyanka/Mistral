class Solution {
    List<Integer> dfs(List<Integer>list,Map<Integer,List<Integer>>map,int key,int[] vis){
        //visted again means traversal completed for a given connected chunk of nodes
        if(vis[key]==1)return list;
        //mark node as visted
        vis[key]=1;
        //store list in new list
        List<Integer>li=new ArrayList<>(list);
        li.add(key);
        for(int i=0;i<map.get(key).size();i++){
            //dfs call for each not visited adjacent node
            int adjNode=map.get(key).get(i);
            if(vis[adjNode]==0)li=dfs(li,map,adjNode,vis);
        }
        return li;
    }
    int conn(List<Integer>list,Map<Integer,List<Integer>>adjList){
        int cnt=0;
         for(Integer i:list){
             //if a node can visit to all other node
             //means adj list just lack itself
             //if we add it to its own adjacency list, 
             //adj will be equal to list.
             List<Integer>adj=new ArrayList<>(adjList.get(i));
             adj.add(i);
             Collections.sort(adj);
             if(list.equals(adj))cnt++;
         }
        return cnt==list.size()?1:0;
    }
    public int countCompleteComponents(int n, int[][] edges) {
        //make adjacency list using map
        Map<Integer,List<Integer>>map=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            //undirected graph so, store both nodes in each other 
            map.putIfAbsent(edges[i][0],new ArrayList<>());
            map.get(edges[i][0]).add(edges[i][1]);
            map.putIfAbsent(edges[i][1],new ArrayList<>());
            map.get(edges[i][1]).add(edges[i][0]);
        }
        
        for(int i=0;i<n;i++){
            //empty adjacency list for single nodes
            map.putIfAbsent(i,new ArrayList<>());
        }
        int[] vis=new int[map.size()];
        int sum=0;
        for(Map.Entry<Integer,List<Integer>>m:map.entrySet()){
            if(vis[m.getKey()]==0){
                List<Integer>list=new ArrayList<>();
                //get the list of connected nodes
                list=dfs(list,map,m.getKey(),vis);
                
                if(list.size()==1)sum++;
                else{
                    //sort it to match with the adjacency list of particular nodes.
                    Collections.sort(list);
                    sum+=conn(list,map);
                }
            }
        }
        return sum;
    }
}