import java.util.*;

class BFS{

Queue<Integer> queue;

public BFS(){

queue=new LinkedList<Integer>();
}

 public void bfs(int[][] adj,int source)
 {
 int nodes=adj[source].length-1;
 int[] visited=new int[nodes+1];
 int i,element;

 visited[source]=1;
 queue.add(source);
  while(!queue.isEmpty())
  {
   element=queue.remove();
   i=element;
   System.out.println(element);

   while(i<=nodes)
   {
    if(adj[element][i]==1 && visited[i]==0)
    {
     queue.add(i);
     visited[i]=1;
    }
    i++;
   }
  }
 }

 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter the no. of nodes");
   int nodes=sc.nextInt();

   System.out.println("Enter the no. of edges");
   int m=sc.nextInt();
   int[][] adj=new int[nodes+1][nodes+1];

   System.out.println("Enter the edges");
   for(int i=0;i<m;i++){
   adj[sc.nextInt()][sc.nextInt()]=1;
   }

   System.out.println("Enter the  source");
   int source=sc.nextInt();

   BFS ob=new BFS();
   ob.bfs(adj,source);
 }	
}


