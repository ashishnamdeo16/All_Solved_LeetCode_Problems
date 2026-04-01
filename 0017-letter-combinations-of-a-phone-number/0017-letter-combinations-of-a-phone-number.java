class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        List<String> finalList = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        findAllCombinations(digits,finalList,temp,0,map);
        return finalList;
    }

    public void findAllCombinations(String digits,List<String> finalList,StringBuilder temp,int index,HashMap<Character,String> map){
        if(index == digits.length()){
            finalList.add(temp.toString());
            return;
        }
        String a = map.get(digits.charAt(index));
        for(int i =0;i<a.length();i++){
            temp.append(a.charAt(i));
            findAllCombinations(digits,finalList,temp,index+1,map);
            temp.deleteCharAt(temp.length() - 1);
        }
        return;
    }
}