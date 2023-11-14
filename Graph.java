package graph;
import java.util.ArrayList;
import java.util.List;

public class Graph<T> {
  List<Node<T>> nodes = new ArrayList<>();

  public Graph() {

  }

  public void addNode(Node<T> node) {
    nodes.add(node);
  }

  public List<Node<T>> getNodes() {
    return nodes;
  }

  public void howLong(Node<T> start, Node<T> end) {

	  if(start.equals(end))
	  {
		  System.out.println("You can get from  " + start.value + " to " + end.value + " in 0 minutes.");
		  System.out.println("You are already there!");
		  return;
	  }
    List<Pair<Node<T>, Integer>> visited = new ArrayList<>();
    List<Node<T>> notVisited = new ArrayList<>();

    // Fill up the node lists
    for (var node : nodes) {
      if (node != start) {
        notVisited.add(node);
      }
    }

    visited.add(new Pair<>(start, 0));

    // Find the next closest node

    while (notVisited.size() > 0) {
      Node<T> bestNode = null;
      int bestTime = 30;
      for (var pair : visited) {
        var node = pair.first;
        var time = pair.second;
        for (var edge : node.edges) {
          if (visited.stream().anyMatch(e -> e.first == edge.toNode))
            continue;
          // If we get here, we are not in the visited list
          var totalTime = edge.time + time;
          if (totalTime < bestTime) {
            bestNode = edge.toNode;
            bestTime = totalTime;
          }
        }
      }

      // Now add the visited node
      visited.add(new Pair<>(bestNode, bestTime));
      notVisited.remove(bestNode);
      if (bestNode == end) {
        System.out.println("You can get from  " + start.value + " to " + end.value + " in " + bestTime + " minutes.");
        
        if(start.value == "Arts and Science Hall" || start.value == "Weber Fine Arts Building" || start.value == "Roskens Hall"
        		|| start.value == "CPACS Building" || start.value == "H&K Builing" || start.value == "Criss Library" || start.value == "University Village"
        		|| start.value == "Maverick Village" || start.value == "Milo Bail Student Center")
        {
        	if(end.value == "Mammel Hall" || end.value == "Peter Kiewit Institute" || end.value == "Baxter Arena" || end.value == "Scott Crossing")
        		System.out.println("Use the UNO shuttle (Blue Route).");
        }
        
        if(end.value == "Arts and Science Hall" || end.value == "Weber Fine Arts Building" || end.value == "Roskens Hall"
        		|| end.value == "CPACS Building" || end.value == "H&K Builing" || end.value == "Criss Library" || end.value == "University Village"
        		|| end.value == "Maverick Village" || end.value == "Milo Bail Student Center")
        {
        	if(start.value == "Mammel Hall" || start.value == "Peter Kiewit Institute" || start.value == "Baxter Arena" || start.value == "Scott Crossing")
        		System.out.println("Use the UNO shuttle (Blue Route).");
        }
        	
        break;
      }
      // break;
    }

  }

}
