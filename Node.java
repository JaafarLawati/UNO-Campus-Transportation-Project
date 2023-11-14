package graph;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
  List<DirectedEdge<T>> edges = new ArrayList<>();
  T value;
  
  public Node(T value){
    this.value = value;
  }

  public void addEdge(DirectedEdge<T> edge){
    edges.add(edge);
  }
  
}
