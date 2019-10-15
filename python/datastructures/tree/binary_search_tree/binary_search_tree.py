class Node:

    def __init__(self, value):
        self.value = value
        self.right = None
        self.left = None


class BinarySearchTree:

    def __init__(self, value):
        self.root = None

    def insert(self, value):
        newNode = Node(value)

        if self.root is None:
            self.root = newNode

        curr = self.root

        while True:
            if value == curr.value:
                return
            if value < curr.value:
                if curr.left is None:
                    curr.left = newNode
                    return self
                else:
                    curr = curr.left
            elif value > curr.value:
                if curr.right is None:
                    curr.right = newNode
                    return self
                else:
                    curr = curr.right

    def find(self, value):

        if self.root is None:
            return False

        curr = self.root

        found = False

        while True:

            if value == curr.value:
                found = True

            if value < curr.value:

                curr = curr.left

            elif value > curr.value:

                curr = curr.right

        if found is False:
            return False

        return curr

    def BFS(self):

        queue = []
        visited = []

        node = self.root

        queue = node

        while len(queue):

            node = queue.shift()
            visited.push(node)

            if node.left is not None:
                queue.push(node.left)
            if node.right is not None:
                queue.push(node.right)
        return visited

    def DFSPreOrder(self):

        output = []

        def traverse(node):

            output.push(node.value)

            if node.left is not None:
                traverse(node.left)

            if node.right is not None:
                traverse(node.right)

        traverse(self.root)

        return output

    def DFSPostOrder(self):

        output = []

        def traverse(node):
            if node.left is not None:
                traverse(node.left)
            if node.right is not None:
                traverse(node.right)

            output.push(node.value)
        traverse(self.root)

        return output

    def DFSInOrder(self):

        output = []

        def traverse(node):

            if node.left is not None:
                traverse(node.left)

            output.push(node.value)

            if node.right is not None:
                traverse(node.right)

        traverse(self.root)

        return output
