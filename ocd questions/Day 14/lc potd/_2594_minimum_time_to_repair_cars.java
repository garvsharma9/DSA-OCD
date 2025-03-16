package ocd questions.Day 14.lc potd;
//TC:O(log(R)*N)
// SC:O(1)
public class _2594_minimum_time_to_repair_cars {
    public long repairCars(int[] ranks, int cars) {
        long l = 1;
        Arrays.sort(ranks);
        long h = (long)ranks[0]*cars*cars;
        long ans = h;
        while (l <= h) {
            long mid = l+(h-l)/2;
            if (check(ranks, mid, cars)) {
                h = mid - 1;
                ans = mid;
            } else
                l = mid + 1;
        }
        return ans;
    }

    boolean check(int ranks[], long mid, int cars) {
        int count = 0;
        for (int rank : ranks) {
            count += Math.sqrt(mid / rank);
            if(count>=cars)
            return true;
        }
        return count >= cars;
    }
}
