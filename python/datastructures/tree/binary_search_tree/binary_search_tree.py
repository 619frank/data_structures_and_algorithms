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
