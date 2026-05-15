class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length -1;
        while (i < j) {
            while (i > 0 && i < j && numbers[i] == numbers[i-1]) i++;
            while (j < numbers.length -1 && i < j && numbers[j] == numbers[j+1]) j--;
            if (numbers[i] + numbers[j] > target) j--;
            else if (numbers[i] + numbers[j] < target) i++;
            else return new int[] {i + 1, j + 1};
        }
        return new int[2];
    }
}
