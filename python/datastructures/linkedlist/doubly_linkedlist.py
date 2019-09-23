# import json
import jsonpickle


class Node:

    def __init__(self, value):
        self.prev = None
        self.next = None
        self.value = value


class DoublyLinkedList:

    def __init__(self):

        self.length = 0
        self.head = None
        self.tail = None

    def push(self, value):

        newNode = Node(value)
        if self.head is None:
            self.head = newNode
            self.tail = newNode
        else:
            oldTail = self.tail

            oldTail.next = newNode
            newNode.prev = oldTail
            self.tail = newNode

        self.length += 1
        return True

    def pop(self):
        poppedNode = self.tail
        if self.head is None:
            return False
        if self.length == 1:
            self.head = None
            self.tail = None
        else:
            self.tail = poppedNode.prev
            self.tail.next = None
            poppedNode.prev = None

        self.length -= self.length
        return poppedNode

    def shift(self):

        if self.head is Node:
            return False
        oldHead = self.head
        if self.length == 1:
            self.head = None
            self.tail = None
        else:

            self.head = oldHead.next
            self.head.prev = None
            oldHead.next = None
        self.length -= 1

        return oldHead


dll = DoublyLinkedList()
dll.push(1)
dll.push(2)
dll.push(3)
dll.push(4)
dll.push(5)
print(dll.head.value)
print(dll.head.prev)
print(dll.head.next.value)
print(dll.head.next.next.value)
print(dll.head.next.next.next.value)
print(dll.tail.value)
print(dll.tail.prev.value)
print(dll.tail.next)
print(dll.shift().__dict__)
print(jsonpickle.encode(dll))
