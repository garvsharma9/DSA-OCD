package Day 7.lc;

public class 605_can_place_flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 1)
            return true;
        if (flowerbed.length == 1 && flowerbed[0] == 1 && n == 1)
            return false;

        if (n == 0)
            return true;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i == 0) {
                    if (flowerbed[i + 1] == 0) {
                        n--;
                        flowerbed[i] = 1;
                        if (n == 0)
                            return true;
                        System.out.println("first");
                    } else
                        continue;
                }

                if (i == flowerbed.length - 1) {
                    if (flowerbed[i - 1] == 0) {
                        n--;
                        flowerbed[i] = 1;
                        if (n == 0)
                            return true;
                        System.out.println("second");
                    } else
                        continue;
                } 
                if(i>0 && i<flowerbed.length-1) {
                    if (flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
                        n--;
                        flowerbed[i] = 1;
                        if (n == 0)
                            return true;
                        System.out.println("third");
                    }
                }

            }

        }

        if (n > 0)
            return false;
        return true;
    }
}
