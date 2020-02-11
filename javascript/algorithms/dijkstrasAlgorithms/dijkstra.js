{
    // dijkstras algorithm only works with weighted graphs

    class PriorityQueue{
        constructor(){
            this.values = []
        }
        enqueue(val,priority){
            this.values.push({val,priority})
            this.sort()
            return true
        }
        dequeue(){
            return this.values.shift()
        }
        sort(){
            this.values.sort((a,b)=> a.priority - b.priority)
        }
    }

    class WeightedGraph{
        constructor(){
            this.adjacencyList = []
        }
        addVertex(vertex){
            if(!this.adjacencyList[vertex])
                this.adjacencyList[vertex] = []
            return true
        }
        addEdge(vertex1,vertex2,weight){
            this.adjacencyList[vertex1].push({node:vertex2,weight})
            this.adjacencyList[vertex2].push({node:vertex1,weight})
        }
        //find the shortest path between two vertex in a graph
        dijkstraShortestFindShortestPath(start,finish){
            const nodes = new PriorityQueue
            const distance = {}
            const previous = {}
            const path = []
            let smallest
            for(let vertex in this.adjacencyList){
                if(vertex === start){
                    distance[vertex] = 0
                    nodes.enqueue(vertex,0)                    
                }else{
                    distance[vertex] = Infinity
                    nodes.enqueue(vertex,Infinity)
                }
                previous[vertex] = null
            }
            while(nodes.values.length){
                smallest = nodes.dequeue().val 
                if(smallest === finish){
                    while(previous[smallest]){
                        path.push(smallest)
                        smallest = previous[smallest]
                    }
                    break
                }
                if(smallest || distance[smallest] !== Infinity){
                    for(let neighbor in this.adjacencyList[smallest]){
                        let nextNode = this.adjacencyList[smallest][neighbor]
                        let candidate = distance[smallest] + nextNode.weight;
                        let nextNeighbor = nextNode.node 
                        if(candidate < distance[nextNeighbor]){
                            distance[nextNeighbor] = candidate
                            previous[nextNeighbor] = smallest
                            nodes.enqueue(nextNeighbor,candidate)
                        }
                    }
                }
            }
            return path.concat(smallest).reverse()
        }
    }
    console.clear()
    var graph = new WeightedGraph()
    graph.addVertex("A");
    graph.addVertex("B");
    graph.addVertex("C");
    graph.addVertex("D");
    graph.addVertex("E");
    graph.addVertex("F");

    graph.addEdge("A","B", 4);
    graph.addEdge("A","C", 2);
    graph.addEdge("B","E", 3);
    graph.addEdge("C","D", 2);
    graph.addEdge("C","F", 4);
    graph.addEdge("D","E", 3);
    graph.addEdge("D","F", 1);
    graph.addEdge("E","F", 1);


    graph.dijkstraShortestFindShortestPath("A", "E");
}
