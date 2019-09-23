# import json
import math
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

        if self.head is None:
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

    def unshift(self, value):

        if self.head is None:
            self.push(value)
            return True

        newHead = Node(value)

        self.head.prev = newHead
        newHead.next = self.head

        self.head = newHead

        self.length += 1

        return True

    def get(self, index):
        if index < 0 or index > self.length:
            return False

        middle = math.floor(self.length/2)

        if index <= middle:
            # starting from the beginning
            current = self.head
            count = 1
            while count <= index:
                count += 1
                current = current.next
            return current

        if index > middle:
            current = self.tail
            count = self.length - 1
            while count > index:
                count += 1
                current = current.prev
            return current


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
dll.unshift(6)
# print(vars(dll))
# print(jsonpickle.encode(dll))
print(dll.get(4).value)
