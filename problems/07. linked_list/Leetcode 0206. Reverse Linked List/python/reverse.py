class Node:
    def __init__(self, value):
        self.value = value
        self.next = None
        
class SinglyLinkedList:
    
    def __init__(self):
        self.head = None
        self.tail = None
        
    def insert(self, value):
        if self.head is None:
            self.head = Node(value)
            self.tail = self.head
        else:
            self.tail.next = Node(value)
            self.tail = self.tail.next
        return self.head            

    def printSLL(self):
        current = self.head
        while current:
            print(current.value)
            current = current.next
    # 1 2 3 4 None

    def reverse(self):
        current = self.head
        tail = None
        while current is not None:
            next = current.next # next = 2, 3, 4, None 
            current.next = tail # current = 1, None 
            tail = current # tail = 1, None 
            current = next # current = 2, 3, 4, None 
        
sll = SinglyLinkedList()
sll.insert(1)
sll.insert(2)
sll.insert(3)

sll.printSLL()
print("\n")
sll.reverse()
sll.printSLL()