import java.util.*;
import java.lang.*;

public class GraphMatrix{

public static void main(String[] args) throws java.lang.Exception
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no. of vertices");

int v=sc.nextInt();

System.out.println("Enter the no. of edges");
int edges=sc.nextInt();

int[][]adj=new int[v+1][v+1];

System.out.println("Enter the edges");

for(int i=1;i<=edges;i++){
int from=sc.nextInt();
int to=sc.nextInt();
adj[to][from]++;
}

for(int i=0;i<=v;i++)
    {
   for(int j=0;j<=v;j++)
     {
     if(i==0)System.out.print((j+1)+" ");
     else if(j==0)System.out.print((i+1)+" ");
     else System.out.print(adj[i][j]+" ");
     }
   System.out.println();
    }
  } 
} 



