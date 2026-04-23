class Solution {
    public String[] findWords(String[] words) {
        List<String> arr = new ArrayList<>();
        String firstRow = "qwertyuiop";
        String secRow = "asdfghjkl";
        String thidrRow = "zxcvbnm";
        for(String s : words){
            if(functFind(s,firstRow)){
                arr.add(s);
            }else if(functFind(s,secRow)){
                arr.add(s);
            }else if(functFind(s,thidrRow)){
                arr.add(s);
            }
        }

        if(arr.isEmpty()) return new String[]{};
        String[] fin = new String[arr.size()];
        for(int i=0;i<arr.size();i++){
            fin[i] = arr.get(i);
        }
        return fin;
    }

    public boolean functFind(String word,String row){
        Set<Character> set = new HashSet<>();
        for(char s : row.toCharArray()){
            set.add(s);
        }
        for(char c : word.toCharArray()){
            if(!set.contains(Character.toLowerCase(c))){
                return false;
            }
        }
        return true;
    }
}

//Can this word be Formed using firstRow

//Can this word be Formed using SecRow

//Can this word be Formed using ThirdRow