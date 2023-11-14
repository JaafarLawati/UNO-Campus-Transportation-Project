package graph;


public class DirectedEdge<T> {
  Node<T> toNode;
  int time;

  public DirectedEdge(Node<T> toNode, int time){
    this.toNode = toNode;
    this.time = time;
  }

  
}