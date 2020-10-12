class Node:
    def _init_(self, val):

        self.left = None
        self.right = None
        self.parent = None
        self.val = val

class BST:
    def _init_(self, root):

        self.root = root

    def lca(a,b):
        ListA = []
        ListB = []
        temp =a
        loop = 0
        while loop<2
            while temp is not None
                if loop == 0
                    ListA.append(temp)
                else ListB.append(temp)
                temp=temp.parent
            temp = b
            loop+=1
        for x in ListA:
            for y in ListB:
                if ListA[x] == ListB[y]
                    return ListA[x]
        return None



