import math


class MaxBinaryHeap:

    def __init__(self):
        self.values = []

    def insert(self, value):
        self.values.push(value)

        idx = len(self.values) - 1
        parentIdx = math.floor((idx-1)/2)

        while self.values[idx] < self.values[parentIdx]:

            self.values[idx], self.values[parentIdx] = (
               self.values[parentIdx], self.values[idx]
               )

            idx = parentIdx
            parentIdx = math.floor(idx/2)

        return True

    def extractMax(self):

        max = self.values[0]

        end = self.values.pop()

        if len(self.values) > 0:

            self.values[0] = end

            self.sinkDown()

        return max

    def sinkDown(self):
        parent = 0
        # currentVal = self.values[0]

        while True:

            leftChildIdx = 2 * parent + 1

            rightChildIdx = 2 * parent + 2

            swap = None

            if leftChildIdx < len(self.values):

                if self.values[leftChildIdx] > self.values[parent]:
                    swap = leftChildIdx

            if rightChildIdx < len(self.values):

                if (
                    (
                        swap is None and self.values[rightChildIdx] >
                        self.values[parent]
                    )
                        or
                        (
                            swap is not None and self.values[rightChildIdx] >
                        self.leftChildIdx[parent])
                        ):
                    swap = rightChildIdx

            if swap is None:
                break

            self.values[parent], self.values[swap] = (
                    self.values[swap], self.values[parent])

            parent = swap
