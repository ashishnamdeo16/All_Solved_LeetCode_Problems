class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int canCap = capacity;
        int x = -1;
        int plant = 0;
        int steps = 0;
        int count = 0;

        while(plant < plants.length){
            if(plants[plant] <= canCap){
                canCap -= plants[plant];
                steps++;
            }else{
                canCap = capacity;
                canCap -= plants[plant];
                steps += plant +  plant + 1;
            }
            plant++;
        }

        return steps; 
    }
}

// index  - Plants 
// plants[i] = -1 // River 
// left to right 
// int x = -1;


//Can Cp = 5
// l = 0 
// step = 0
// 2 < 5 cancap = 3 l = 1 step = 1
// 2 < 3 cancap = 1 l = 2 step = 2
// 3 < 1 cancap = 5 l = 3 step +=  (step * 2)  


