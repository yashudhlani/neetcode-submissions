class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length;

        while (l < r) {
            int mid = (l + r) >> 1;

            if (target < matrix[mid][0]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        if (l == 0) return false;
        int row = l - 1;

        l = 0;
        r = matrix[0].length - 1;

        while (l <= r) {
            int mid = (l + r) >> 1;

            if (matrix[row][mid] == target) return true;

            if (target < matrix[row][mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }
}
