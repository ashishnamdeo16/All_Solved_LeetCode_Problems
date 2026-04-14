class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        Set<Character> set = new HashSet<>();
        for(char ch : brokenLetters.toCharArray()){
            set.add(ch);
        }

        int count = 0;

        for(String s : arr){
            count++;
            for(int i =0;i<s.length();i++){
                if(set.contains(s.charAt(i))){
                    count--;
                    break;
                }
            }
        }

        return count;
    }
}