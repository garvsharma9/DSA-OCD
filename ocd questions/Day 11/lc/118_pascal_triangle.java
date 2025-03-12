class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> l;
        for (int i = 0; i < numRows; i++) {
            l = new ArrayList<>(i + 1);

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) l.add(1);
                else
                    l.add(lst.get(i - 1).get(j - 1) + lst.get(i - 1).get(j));
            }
            lst.add(l);
        }
        return lst;
    }

}