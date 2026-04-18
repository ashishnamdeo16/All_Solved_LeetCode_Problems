class Solution {
    public String capitalizeTitle(String title) { 
        String[] arr = title.split(" ");
        String finalTitle = "";
        for(int i=0;i<arr.length;i++){
            String s = arr[i];
            if(s.length() - 1 < 2){
                finalTitle += s.toLowerCase();
            }else{
                finalTitle += Character.toUpperCase(s.charAt(0));
                finalTitle += s.substring(1,s.length()).toLowerCase();
            }
            if(i != arr.length - 1) finalTitle += " ";
        }

        return finalTitle;
    }
}