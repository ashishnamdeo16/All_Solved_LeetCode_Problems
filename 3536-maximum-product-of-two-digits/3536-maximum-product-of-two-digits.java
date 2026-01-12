class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        
        while(n >0){
            int num = n%10;
            list.add(num);
            n /= 10;
        }

        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            int product = 1;
            for(int j=i+1;j<list.size();j++){
                product = list.get(i) * list.get(j);
                if(max < product){
                    max = product;
                }
            }
        }
        return max;
    }
}