class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
         int l = 0;
        int r = plants.length - 1;

        int alice = capacityA;
        int bob = capacityB;

        int count = 0;

        while (l < r) {
            // Alice
            if (alice < plants[l]) {
                count++;
                alice = capacityA;
            }
            alice -= plants[l];
            l++;

            // Bob
            if (bob < plants[r]) {
                count++;
                bob = capacityB;
            }
            bob -= plants[r];
            r--;
        }

        // Middle plant
        if (l == r) {
            if (Math.max(alice, bob) < plants[l]) {
                count++;
            }
        }

        return count;
    }
}

