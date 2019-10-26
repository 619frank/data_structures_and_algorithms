class AdjacencyList:

    def __init_(self):
        self.adjacencyList = {}

    def addVertex(self, vertex):

        if vertex not in self.adjacencyList:
            self.adjacencyList[vertex] = []

    def addEdge(self, v1, v2):

        if v1 and v2 in self.adjacencyList:
            self.adjacencyList[v1].append(v2)
            self.adjacencyList[v2].append(v1)

    def removeEdge(self, vertex1, vertex2):
        self.adjacencyList[vertex1] = filter(
                lambda x: (x is not vertex2),
                self.adjacencyList[vertex1])
        self.adjacencyList[vertex2] = filter(
                lambda x: (x is not vertex1),
                self.adjacencyList[vertex2])

    def removeVertex(self, vertex):

        while len(self.adjacencyList[vertex]):
            currEdge = self.adjacencyList[vertex].pop()
            self.removeEdge(currEdge, vertex)

        self.adjacencyList.remove(vertex)
