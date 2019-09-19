class Stack:

    def __init__(self):
        self.items = []


    def push(self,x):
        self.items.append(x)


    def pop(self):
        return self.items.pop()



stack = Stack()

stack.push(1)
print(stack.items)

stack.push(2)

print(stack.items)

print(stack.pop())
