class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int l = 0;//alice
        int r = plants.length - 1;//bob

        int aliceW = capacityA;
        int bobW = capacityB;
        int count = 0;

        while(l < r){
            if(plants[l] <= aliceW){
                 aliceW -= plants[l];
                 l++;
            }else{
                aliceW = capacityA;
                count++;
                if(plants[l] < aliceW){
                  aliceW -= plants[l];
                  l++;
                }
            }

            if(plants[r] <= bobW){
                bobW -= plants[r];
                 r--;
            }else{
                bobW = capacityB;
                count++;
                if(plants[r] < bobW){
                bobW -= plants[r];
                  r--;
                }
            }

            if(l == r){
            if(Math.max(aliceW, bobW) < plants[l]) {
                count++;
                }
            }
        }

        return count;

    }
}

//Alice Capcity = capacityA
//Bob Capacity = capacity B
//n = no of Plants 
//index = plant 
//plants[index] = plants location
//[2,2,3,3,7]
//a = 7 b = 7

// l = 0 and r = 4
// l++ = 1 => a = 5
// r-- = 3 => b = 0
// l = 1 and r = 3 
// l++ = 2 => a = 2
// r-- = 3 => b = 0 -  count = 1


