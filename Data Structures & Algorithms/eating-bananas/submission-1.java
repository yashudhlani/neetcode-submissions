class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile: piles) {
            max = Integer.max(max, pile);
        }
        int l = 1;
        int r = max;
        System.out.println("Max = " + max);

        while (l < r) {
            int mid = (l + r) >> 1;

            int hours = 0;
            for (int pile: piles) {
                hours += mid >= pile ? 1 : pile % mid == 0 ? pile / mid: (pile/mid) + 1;
            }
            if (hours <= h) {
                r = mid;
            } else {
                l = mid + 1;
            }
        } 

        return l;

    }
}
