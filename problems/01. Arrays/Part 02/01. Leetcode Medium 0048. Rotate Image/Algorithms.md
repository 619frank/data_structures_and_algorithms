### In-Place Transpose and Reverse Approach
Transpose the matrix: Convert rows to columns.
Reverse each row: Swap the elements horizontally.

Time Complexity: O(n{2})
Space Complexity: O(1)

### In-Place Rotation by Layer
Approach: Rotate the matrix layer by layer.

Important:
 The layer-by-layer rotation approach specifically works for 𝑛×𝑛 square matrices. It relies on the symmetry of a square matrix to perform the rotation. For a rectangular matrix (where the number of rows and columns are not equal), this method is not applicable because it will lead to index out-of-bound errors and incorrect rotations.

Steps:
Iterate over each layer of the matrix from the outermost to the innermost.
For each layer, rotate the elements in groups of four.

Time Complexity: O(N{2})

Space Complexity: O(1)