// DFS Traversal -> select one child of root node 
//    and follow all its child nodes, then come to
//    the first selected node's sibling

{
    class Graph {
        constructor() {
            this.adjacencyList = {}
        }
        //this is the actual value
        addVertex(vertex) {
            if (!this.adjacencyList[vertex])
                this.adjacencyList[vertex] = []
            return true
        }
        //this is the connection
        addEdge(v1, v2) {
            this.adjacencyList[v1].push(v2)
            this.adjacencyList[v2].push(v1)
        }

        removeEdge(vertex1, vertex2) {
            this.adjacencyList[vertex1] = this.adjacencyList[vertex1].filter((v)=>v !== vertex2)
            this.adjacencyList[vertex2] = this.adjacencyList[vertex2].filter((v)=>v !== vertex1)
        }
        removeVertex(vertex) {
            while (this.adjacencyList[vertex].length) {
                const adjacentVertex = this.adjacencyList[vertex].pop()
                this.removeEdge(vertex, adjacentVertex)
            }
            delete this.adjacencyList[vertex]
        }
        //we have to pass the starting root node here as parameter
        depthFirstSearchRecursive(start) {
            let result = []
            let visited = {}
            const adjacencyList = this.adjacencyList;
            (function dfs(vertex) {
                if (!vertex)
                    return null
                visited[vertex] = true
                result.push(vertex)
                adjacencyList[vertex].forEach(neighbor=>{
                    if (!visited[neighbor]) {
                        return dfs(neighbor)
                    }
                }
                )
            })(start)
            return result
        }

        depthFirstSearchIterative(start){
            let result = []
            let stack = [start]
            let visited = {}
            let currentVertex
            visited[start] = true
            while(stack.length){
                currentVertex = stack.pop()
                result.push(currentVertex)
                this.adjacencyList[currentVertex].forEach((neighbor)=>{
                      if(!visited[neighbor]){
                          visited[neighbor] = true
                          stack.push(neighbor)
                      }
                })
            }
            return result
        }

        breathFirstSearch(start){
            let queue = [start]
            let visited = {}
            let result = []
            let currentVertex
            while(queue.length){
                let currentVertex = queue.shift()
                result.push(currentVertex)
                this.adjacencyList[currentVertex].forEach(neighbor=>{
                    if(!visited[neighbor]){
                        visited[neighbor] = true
                        queue.push(neighbor)
                    }
                })
            }
            return result
        }
    }
    console.clear()
    var g = new Graph
    g.addVertex("A")
    g.addVertex("B")
    g.addVertex("C")
    g.addVertex("D")
    g.addVertex("E")
    g.addVertex("F")

    g.addEdge("A", "B")
    g.addEdge("A", "C")
    g.addEdge("B", "D")
    g.addEdge("C", "E")
    g.addEdge("D", "E")
    g.addEdge("D", "F")
    g.addEdge("E", "F")
}

