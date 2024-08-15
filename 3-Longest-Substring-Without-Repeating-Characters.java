class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        HashSet<Character> el= new HashSet<>();
        int max=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(el.isEmpty()){
                el.add(s.charAt(i));
                int l=i;
                if(l!=s.length()){
                l++;}
                while((l<n)&&!el.contains(s.charAt(l))){
                    el.add(s.charAt(l));
                    l++;
                }
                int size=el.size();
                int rem=l;
                if(size>max){
                    max=size;
                }
                while(!el.isEmpty()){
                    el.remove(s.charAt(--rem));
                  
                }

                i=rem;
            }
         }
         return max;
    }
}