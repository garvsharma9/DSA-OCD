//Question link:- https://leetcode.com/problems/distribute-money-to-maximum-children/description/?envType=problem-list-v2&envId=math


package Day 5.lc;

public class 2591_Distribute _money_to_children {
    public int distMoney(int money, int children) {
        if(money<children)
        return -1;
        money-=children;
        int maxchild=0;
        while(money>=7 && maxchild<children)
        {
            maxchild++;
            money-=7;
        }

        if((money>0 && maxchild==children) || (money==3 && children-maxchild==1)) 
        maxchild--;
        return maxchild;
    }
}
