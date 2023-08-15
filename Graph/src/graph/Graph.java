
package graph;

public class Graph {
    int vertex;
    doubleLinkedList list[];
    public Graph(int vertex){
        this.vertex=vertex;
        list = new doubleLinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i]=new doubleLinkedList();
        }
    }

    Graph() {
    }
    public void addEdge(int source, int destination, int type) {
        if (type == 0) {
            list[source].addFirst(destination);
            list[destination].addFirst(source);
        } else {
            list[source].addFirst(destination);
        }
    }
    public void degree(int source)  {
        System.out.println("Degree vertex " + source + " : " + list[source].size());
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size; j++) {
                if (list[i].get(j) == source) {
                    ++totalIn;
                }
            }
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("Degree dari vertex " + source + " : " + (totalIn + totalOut));
    }
    public void removeAllEdge(){
       for(int i=0; i<vertex; i++){
           list[i].clear();
       }
       System.out.println("Graph Berhasil dikosongkan");
   }
    public void removeEdge(int source, int destination){
       for (int i = 0; i < list[source].size(); i++) {
            if (list[source].get(i) == destination) {
                list[source].remove(i);
            }
        }
        for (int j = 0; j < list[destination].size(); j++) {
            if (list[destination].get(j) == source) {
                list[destination].remove(j);
            }
        }
    }
   public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                System.out.print("vertex " + i + " terhubung dengan : ");
                System.out.print(list[i].get(j) + " ");
                System.out.println("");
            }
        }
        System.out.println("");
    }
}
