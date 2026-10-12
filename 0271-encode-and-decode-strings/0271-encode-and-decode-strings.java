public class Codec {

    // Encodes a list of strings to a single string.
     List<String> list = new ArrayList<>();
    public String encode(List<String> strs) {
        
        String encoded = "";

        for(String x : strs){
            encoded += x;
            list.add(x);
        }
        
        return encoded;
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        return list;
     }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));

//