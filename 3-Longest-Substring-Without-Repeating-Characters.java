class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashSet<Character> el= new HashSet<>();
         int start=0;
         int max=0;
         int n=s.length();
         for(int end=0;end<n;end++){
            while(el.contains(s.charAt(end))){
                el.remove(s.charAt(start));
                start++;
            }
            el.add(s.charAt(end));
            max=Math.max(max,end-start+1);
         }
         return max;
    }
}