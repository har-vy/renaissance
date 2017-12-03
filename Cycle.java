import java.util.*;

class Cycle{

 public boolean cycle(int v,int[][] adj,boolean[] visited,int parent)
 {
  visited[v]=true;
  int i;
  
  i=1;
  while(i<=adj[v].length-1){
   if(!visited[i] && adj[v][i]==1){
    if(cycle(i,adj,visited,v))return true;
   }

   else if(i!=parent) return true;
   i++;
  }

  return false;
 }
 public boolean isCyclic(int[][] adj){
  boolean[] visited=new boolean[adj[0].length];

  for(int u=1;u<=adj[0].length;u++){
   if(!visited[u] && cycle(u,adj,visited,-1)) return true;
   }
  return false;
 }
 public static void main(String[] args){
 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no. of vertices");
  int n=sc.nextInt();

  System.out.println("Enter the no. of edges");
  int edges=sc.nextInt();
  System.out.println("Enter the edges");
  int[][] adj=new int[n+1][n+1];
  System.out.println();

  for(int i=0;i<edges;i++){
	int x=sc.nextInt();int y=sc.nextInt();  
   adj[x][y]=1;
   adj[y][x]=1;
  }
  Cycle ob=new Cycle();
  
  if(ob.isCyclic(adj))System.out.println("The Undirected Graph contains a cycle");
  else System.out.println("The undirected graph does not contain a cycle");
 }
}
