class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        if(nums.length>st.size()){
            return true;
        }
        return false;
    }
}