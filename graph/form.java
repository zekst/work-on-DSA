import java.util.ArrayList;
import java.util.Queue;

public class form 
{
    static void addedge(int x,int y, ArrayList<ArrayList<Integer>> adj)
    {
        adj.get(x).add(y);
        adj.get(y).add(x);
    }
    static void dfs(ArrayList<ArrayList<Integer>> vec, int source,boolean check[])
    {
        check[source]=true;
        System.out.println(source);
        for(int i: vec.get(source))
        {
            if(!check[i])
            dfs(vec, source, check);
        }

    }
    static void bfs(ArrayList<ArrayList<Integer>> vec,Queue<Integer> q,boolean check[])
    {
        if(q.isEmpty())
        return;

    

        int val=q.poll();
        check[val]=true;
        System.out.println(val);
        for(int i: vec.get(val))
        {
            if(!check[i])
            q.add(i);

            bfs(vec, q, check);
        }
    }
    public static void main(String[] args) 
    {

        //can can add edge here
        
    }
}
