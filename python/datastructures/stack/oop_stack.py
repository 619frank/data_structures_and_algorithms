class Stack:

    def __init__(self):
        self.items = []


    def push(self,x):
        self.items.append(x)


    def pop(self):
        return self.items.pop()

    def peek(self):
        return self.items[len(self.items)-1]

stack = Stack()

stack.push(1)
print(stack.items)

stack.push(2)
print(stack.peek())
print(stack.items)

print(stack.pop())
