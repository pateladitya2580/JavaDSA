package DSA.BinaryTrees;
/*
TREE - BASIC NOTES

1. TREE DATA STRUCTURE

Tree is a hierarchical data structure.

Array, Linked List, Stack, Queue -> Linear Data Structures
Tree -> Hierarchical Data Structure

Tree me data parent-child relationship me arranged hota hai.


2. REPRESENTATION OF TREE

Example:

                 1
               /   \
              2     3
            / | \   / \
           4  5  6 7   8
             / \
            9  10

Root:
- Tree ka top-most node Root hota hai.
- Above tree me Root = 1

Leaf Node:
- Jis node ke 0 children hote hain, use Leaf Node kehte hain.
- Above tree me Leaf Nodes = 4, 6, 7, 8, 9, 10

Comparison:

Linked List -> Head
Tree        -> Root

Linked List -> Tail
Tree        -> Leaf Nodes


3. BASIC TERMINOLOGY

Root:
- Tree ka top-most node.

Parent Node:
- Kisi node ke directly upar wala connected node uska Parent hota hai.

Example:
        1
       / \
      2   3

1 is Parent of 2 and 3.


Child Node:
- Parent ke directly neeche connected node ko Child kehte hain.

Above example:
2 and 3 are Children of 1.


Sibling Nodes:
- Same parent wale nodes ko Siblings kehte hain.

Above example:
2 and 3 are Siblings because both have same parent 1.


4. LEAF NODE

Leaf Node:
- A node having 0 children is called a Leaf Node.

Example:

        1
       / \
      2   3
     / \
    4   5

Leaf Nodes = 3, 4, 5


5. INTERNAL NODE

Internal Node:
- A node having child nodes is called an Internal Node.

Above example:

Internal Nodes = 1, 2


6. ANCESTOR NODE

Ancestor:
- Kisi node ke upar path me aane wale nodes uske Ancestors hote hain.

Example:

        1
        |
        2
       / \
      5   6
     / \
    9  10

Ancestors of 9 = 1, 2, 5

Remember:
Above Nodes -> Ancestors


7. DESCENDANT NODE

Descendant:
- Kisi node ke neeche aane wale nodes uske Descendants hote hain.

Above example:

Descendants of 2 = 5, 6, 9, 10

Remember:
Below Nodes -> Descendants


8. LEVEL

Level means generation of nodes.

Example:

                 1          Level 1
               /   \
              2     3        Level 2
             / \   / \
            4   5 6   7      Level 3

In these slides:
Root Level = 1


9. SIZE

Size = Total number of nodes in the tree.

Example:

        1
       / \
      2   3

Size = 3


10. NUMBER OF EDGES

Number of Edges = Number of Nodes - 1 or (size -1)

Formula:

Edges = Size - 1

or

E = N - 1

Example:

Nodes = 11
Edges = 11 - 1
Edges = 10


11. HEIGHT

According to these slides:

Height = Levels - 1

Example:

Levels = 4

Height = 4 - 1
Height = 3


12. IMPORTANT PROPERTIES OF TREE

1. Tree traversal is done using:
   - DFS (Depth First Search)
   - BFS (Breadth First Search)

2. Tree has no loop.

3. Tree has no circuit.

4. Tree has no self-loop.


QUICK REVISION

Tree       -> Hierarchical Data Structure
Root       -> Top-most node
Parent     -> Direct upper node
Child      -> Direct lower node
Sibling    -> Nodes having same parent
Leaf       -> Node with 0 children
Internal   -> Node having children
Ancestor   -> Nodes above a node
Descendant -> Nodes below a node
Level      -> Generation of nodes
Size       -> Number of nodes
Edges      -> Nodes - 1
Height     -> Levels - 1

IMPORTANT FORMULAS:

Size = Number of Nodes

Edges = Size - 1

Height = Levels - 1

=====================================================================================================================
/*

1. TYPES OF TREES

Main types discussed:

1. Generic Tree
2. Binary Tree
3. Binary Search Tree (BST)
4. AVL Tree


--------------------------------------------------
2. GENERIC TREE
--------------------------------------------------

Generic Tree:

- Generic Tree me kisi bhi node ke paas
  koi bhi number of children ho sakte hain.

Example:

                A
             /  |  \
            B   F   J
          / | \ / \ / | | \
         C  D E G H K L M N
                    / \
                   P   Q

Important Point:

Any node in a Generic Tree can have
any number of child nodes.

Example:

A -> 3 children
B -> 3 children
F -> 2 children
J -> 4 children

So there is NO fixed limit on number
of children in Generic Tree.


--------------------------------------------------
3. BINARY TREE
--------------------------------------------------

Binary Tree:

- Binary Tree me kisi bhi node ke maximum
  2 children ho sakte hain.

A node can have:

0 children
OR
1 child
OR
2 children

Example:

             1
           /   \
          7     9
         / \     \
        2   6     0
           / \     \
          8   7     13

Important:

Maximum children of any node = 2

Usually these two children are called:

Left Child
Right Child


--------------------------------------------------
4. BINARY SEARCH TREE (BST)
--------------------------------------------------

Binary Search Tree:

- BST ek special type of Binary Tree hai.
- Isme nodes ki values ek particular order
  me arranged hoti hain.

Example:

             8
           /   \
          3     10
         / \      \
        1   6      14
           / \    /
          4   7  13


Important:

BST is a Binary Tree with an ordering
property.


--------------------------------------------------
5. AVL TREE
--------------------------------------------------

AVL Tree:

- AVL Trees are self-balancing BSTs.
- Ye BST ki height ko balanced rakhne
  ki koshish karte hain.

Example:

             21
            /  \
           11   53
          / \   / \
         9  13 33 61
        /
       8

Important:

AVL Tree = Self-Balancing BST

Iska main purpose tree ko balanced rakhna
hai.


--------------------------------------------------
6. APPLICATIONS OF TREE DATA STRUCTURE
--------------------------------------------------

Trees are used for:

1. Hierarchical Data Structure
2. Searching Efficiency
3. Sorting
4. Dynamic Data
5. Efficient Insertion and Deletion
6. Easy to Implement

Examples of hierarchical data:

- File/Folder structure
- Organization hierarchy
- Other parent-child relationships


--------------------------------------------------
7. WHAT IS A BINARY TREE?
--------------------------------------------------

Binary Tree:

A tree where each node has either:

0 children
OR
1 child
OR
2 children

Maximum children = 2

The two children are:

Left Child
Right Child

Example:

             1
           /   \
          7     9
         / \     \
        2   6     9
           / \
          5  11

Here every node has maximum 2 children.


IMPORTANT DIFFERENCE:

Generic Tree:
- Any number of children

Binary Tree:
- Maximum 2 children


--------------------------------------------------
QUICK REVISION
--------------------------------------------------

Generic Tree
-> Any number of children


Binary Tree
-> Maximum 2 children


BST
-> Binary Tree with ordering property


AVL Tree
-> Self-balancing BST


BINARY TREE CHILDREN:

0 children -> Allowed
1 child    -> Allowed
2 children -> Allowed
3 children -> NOT allowed


TREE TYPES:

Generic Tree
      |
      |-- Any number of children

Binary Tree
      |
      |-- Maximum 2 children

BST
      |
      |-- Special Binary Tree
      |-- Ordering property

AVL Tree
      |
      |-- Self-balancing BST


MOST IMPORTANT:

Generic Tree -> No fixed child limit

Binary Tree  -> Maximum 2 children

BST          -> Ordered Binary Tree

AVL          -> Self-Balancing BST
*/
public class Basic {
}
