class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb = new StringBuilder();
        long a = 1222;

        int num = n;
        
        while(num > 0){
            int rem = num%10;
            if(rem != 0){
                sb.insert(0,rem);
            }
            num /= 10;
        }

        long sum = 0;
        long temp = 0;

        for(char x : sb.toString().toCharArray()){
            int val = Character.getNumericValue(x);
            temp = temp * 10 + (long) val;
            sum += val;
        }

        long val = sum * temp;

        return val;
    }
}

//Find all no zero digits using stringbuilder
//Find Integer value and make a sum
//At the End multiply them and give the result back