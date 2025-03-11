public class 2149_rearrange_by_sign {
    public int[] rearrangeArray(int[] nums) {
       
        int res[] = new int[nums.length];
        int index = 0;
    int positive = 0;
    int negative = 0;
        int sign = 1;
        while (true) {
            if (sign > 0) {
                while (nums[positive] < 0) {
                    positive++;
                }
                res[index++] = nums[positive++];
                if(index==nums.length)
                break;
                sign *= -1;
            } else {
                while (nums[negative] > 0) {
                    negative++;
                }
                res[index++] = nums[negative++];
                if(index==nums.length)
                break;
                sign *= -1;
            }
        }
        return res;

    }
}
