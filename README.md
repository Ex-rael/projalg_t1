# projalg_t1

## Recursive Brute Force Algorithm Formal Definition

$$
\text{LCS}(i, j) =
\begin{cases}
0 & \text{se } i = 0 \text{ ou } j = 0 \\
\text{LCS}(i - 1, j - 1) + 1 & \text{se } x_i = y_j \\
\max(\text{LCS}(i - 1, j), \text{LCS}(i, j - 1)) & \text{se } x_i \ne y_j
\end{cases}
$$
