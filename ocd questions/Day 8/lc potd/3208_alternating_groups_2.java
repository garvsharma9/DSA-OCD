package Day 8.lc potd;

public class 3208_alternating_groups_2 {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int count = 0;
        int len=1;
        int length=colors.length;
        for(int i=0;i<length+k-2;i++)
        {
            if(colors[i%length]!=colors[(i+1)%length])
            len++;
            else
            len=1;
            if(len>=k)
            count++;
        }
        return count;
    }
}
