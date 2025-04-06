class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false ;
        final int MAX_VALUE = 26;
        int[] freq = new int[MAX_VALUE];
        int n = s.length();
        int m = t.length();

        for(int i = 0; i < n ; i++ ){
            freq[s.charAt(i)-'a']++;
        }

        for(int i = 0; i < m ; i++ ){
            freq[t.charAt(i)-'a']--;
        }

        for(int count : freq ) {
            if(count!=0){
                return false ;
            }
        }
        return true;
        
    }
}