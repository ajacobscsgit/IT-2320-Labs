
class Main {
  public static void main(String[] args) {
    // 1. Define the vertices (buildings) based on the campus map
    String[] vertices = {
      "Liberal Arts",                 // vertex 0
      "Student Services",             // vertex 1
      "Health Careers & Sciences",    // vertex 2
      "Health Technologies Center",   // vertex 3
      "Recreation Center",            // vertex 4
      "Technology Learning Center",   // vertex 5
      "Business & Technology",        // vertex 6
      "Theatre"                       // vertex 7
    };

    // 2. Define edges for directly connected walking areas.
    int[][] edges = {
      {0, 1}, {1, 0},   // Liberal Arts <-> Student Services
      {0, 7}, {7, 0},   // Liberal Arts <-> Theatre
      {7, 6}, {6, 7},   // Theatre <-> Business & Technology
      {6, 5}, {5, 6},   // Business & Technology <-> Technology Learning Center
      {6, 1}, {1, 6},   // Business & Technology <-> Student Services
      {5, 1}, {1, 5},   // Technology Learning Center <-> Student Services
      {5, 4}, {4, 5},   // Technology Learning Center <-> Recreation Center
      {1, 2}, {2, 1},   // Student Services <-> Health Careers & Sciences
      {2, 3}, {3, 2},   // Health Careers & Sciences <-> Health Technologies Center
      {2, 4}, {4, 2}    // Health Careers & Sciences <-> Recreation Center
    };

    // 3. Create the graph using the vertices and edges
    UnweightedGraph<String> graph = new UnweightedGraph<>(vertices, edges);


    System.out.println("Campus graph edges:");
    graph.printEdges();
    System.out.println();

    // 4. Perform a depth-first search starting from Business & Technology
    int startVertex = 6;
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(startVertex);

    // 5. Retrieve and print the search order of the DFS traversal
    System.out.println("DFS search order starting from Business & Technology:");
    for (int vertex : dfs.getSearchOrder()) {
      System.out.println(vertex + " - " + graph.getVertex(vertex));
    }
    System.out.println();

    // 6. Print the parent-child relationships for each vertex during DFS
    System.out.println("Parent-child relationships during DFS:");
    for (int i = 0; i < graph.getSize(); i++) {
      int parent = dfs.getParent(i);
      if (parent == -1) {
        System.out.println(graph.getVertex(i) + " has no parent because it is the root.");
      }
      else {
        System.out.println(graph.getVertex(parent) + " -> " + graph.getVertex(i));
      }
    }
    System.out.println();

    // 7. Display paths from Business & Technology to the required buildings
    dfs.printPath(3); // Health Technologies Center
    System.out.println();

    dfs.printPath(1); // Student Services
    System.out.println();

    dfs.printPath(4); // Recreation Center
    System.out.println();
    System.out.println();

    // 8. Print the entire DFS tree
    dfs.printTree();
  }
}
