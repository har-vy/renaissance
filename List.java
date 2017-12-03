import java.util.*;

class List{

 Map<Integer,LinkedList<Integer>> adj;

 public List(int v){
  adj=new HashMap<Integer,LinkedList<Integer>>(); 
  for(int i=1;i<=v;i++){
   adj.put(i,new LinkedList<Integer>());
  
  }
 }
 public void setEdge(int x,int y){
  LinkedList<Integer> temp1=adj.get(x);
  temp1.add(y);
  LinkedList<Integer> temp2=adj.get(y);
  temp2.add(x);
 }
 public LinkedList<Integer> getEdge(int source){
  return adj.get(source);
 }

 public static void main(String[] args){
 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no. of vertices");
  int v=sc.nextInt();

  List list=new List(v);
  System.out.println("Enter the no. of edges");
  int edges=sc.nextInt();

  for(int i=1;i<=edges;i++){
   list.setEdge(sc.nextInt(),sc.nextInt());
  }

  for(int i=1;i<=v;i++){
   System.out.print(i+"->");
   LinkedList<Integer> temp=list.getEdge(i);

   for(int j=1; ;j++){
   
    if(j!=temp.size())System.out.print(temp.get(j-1)+"->");
    else {System.out.print(temp.get(j-1));break;}
   }
   System.out.println();
  }
 }
}
