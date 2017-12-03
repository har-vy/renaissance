import java.util.*;
import java.io.*;

class DFS{

Stack<Integer> stack;

public DFS()
{
stack=new Stack<Integer>();
}

public void dfs(int[][] adj,int source)
 {
  int nodes=adj[source].length-1;
  int[] visited=new int[nodes+1];
  int element=source;
  int i=source;
  stack.push(source);
  visited[source]=1;

  System.out.println(element);
  
  while(!stack.isEmpty())
  {
    element=stack.peek(); 
    i=element;

    while(i<=nodes)
   {
    if(adj[element][i]==1 && visited[i]==0)
    {
     stack.push(i);
     visited[i]=1;
     element=i;
     i=1;
     System.out.println(element);
    }
    i++;
   }
   stack.pop();
  }
 }

public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no. of vertices");
  int v=sc.nextInt();

  System.out.println("Enter the no. of edges");
  int m=sc.nextInt();

  int[][] adj=new int[v+1][v+1];

  for(int i=0;i<m;i++){
  adj[sc.nextInt()][sc.nextInt()]=1;
  }
  
  System.out.println("Enter the source for the graph");
  int source=sc.nextInt();
  DFS ob=new DFS();
  ob.dfs(adj,source);

  sc.close();
 }
}

