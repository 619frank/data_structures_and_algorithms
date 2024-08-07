import json


class Node:
    def __init__(self, value):
        self.value = value
        self.next = None


class SinglyLinkedList:

    def __init__(self):
        self.head = None
        self.tail = None
        self.length = 0

    def push(self, val):

        node = Node(val)

        if self.head is None:
            self.head = node
            self.tail = node
        else:
            self.tail.next = node
            self.tail = node

        self.length += 1

    def pop(self):
        if self.head is None:
            return
        newTail = self.head
        current = newTail

        if self.length == 1:
            self.head = None
            self.tail = None
            self.length = 0
            return current

        while current.next:
            newTail = current
            current = current.next

        newTail.next = None
        self.tail = newTail

        self.length -= 1
        return current

    def shift(self):
        if self.head is None:
            return
        temp = self.head.value
        self.head = self.head.next
        self.length -= 1
        return temp

    def unshift(self, item):
        newHead = Node(item)

        if self.head is None:
            self.head = newHead
            self.tail = newHead
            return
        else:
            newHead.next = self.head
            self.head = newHead

        self.length += 1

    def get(self, index):
        if index < 0 or index > self.length:
            return False

        node = self.head
        counter = 0
        while counter < index:
            node = node.next
            counter += 1
        return node

    def set(self, index, value):
        if index < 0 or index > self.length:
            return False

        node = self.head
        counter = 0
        while counter < index:
            node = node.next
            counter += 1
        node.value = value

    def insert(self, index, value):
        if index < 0 or index > self.length:
            return False

        if index == 0:
            self.unshift(value)
            return True

        if index == self.length:
            self.push(value)
            return True

        newNode = Node(value)

        prev = self.get(index-1)
        current = prev.next

        prev.next = newNode
        newNode.next = current

        return True

    def remove(self, index):
        if index < 0 or index > self.length:
            return False

        if index == 1:
            self.shift()
            return True

        if index == self.length - 1:
            self.pop()
            return True

        priorToRemove = self.get(index - 1)
        remaining = priorToRemove.next.next
        priorToRemove.next = remaining

        self.length -= self.length
        return True

    def traverse(self):
        current = self.head
        while current is not None:
            print(current.value)
            current = current.next


    def reverse(self):
        if self.head is None or self.head.next is None:
            return
        
        current = self.head
        self.tail = self.head
        tail = None
        while current is not None:
            next = current.next # next = 2, 3, 4, None 
            current.next = tail # current = 1, None 
            tail = current # tail = 1, None 
            current = next # current = 2, 3, 4, None 

        self.head = tail  # Update the head to the new first node
        self.tail.next = None  # Ensure the new tail's next is None

sll = SinglyLinkedList()

sll.push(1)

sll.push(2)

sll.push(3)
sll.push(4)
sll.push(5)
sll.traverse()
sll.reverse()
sll.traverse()
# print(json.dumps(sll, default=lambda obj: vars(obj),  indent=2))
