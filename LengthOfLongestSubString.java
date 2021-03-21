public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        
        Map<Character, Integer> visited = new HashMap<>();
        
        String output = "";
        
        for (int start = 0, end = 0; end < s.length(); end++) {
            
            char curChar= s.charAt(end);

            if(visited.containsKey(curChar)){
                start = Math.max(visited.get(curChar)+1, start);
            }
           
            if(output.length() < end - start +1){
                output = s.substring(start, end + 1);
            }
            
            visited.put(curChar, end);
        }
        
        return output.length();
    }
    
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.print(lengthOfLongestSubstring(str));
    }
}
