class Solution {
    public void rotate(int[] nums, int k) {
    Stack<Integer> st = new Stack<>();
    if(nums.length<=1){
        return;
        }
        else if(nums.length==2){
            if(k%2==0){
                return; 
            }
            else{
                int temp=nums[1];
                nums[1]=nums[0];
                nums[0]=temp;
            }
        }
    else{
        if(k<nums.length){
   int i=nums.length-1;
    int arr[]=new int[nums.length];
    int l=k;
    while(k>0){
        st.push(nums[i]);
        i--;
        k--;
    }
    for(int z=0;z<i+1;z++){
        arr[z]=nums[z];
    }
    int j=0;
    while(!st.isEmpty()){
        nums[j]=st.pop();
        j++;
    }
    int zz=0;
    for(int z=j;z<nums.length;z++){
        nums[z]=arr[zz];
        zz++;
    }
}

else if(nums.length==k){
return;
}
 else if(nums.length<k){
    k=k%nums.length;
    if(k==nums.length){
        return;
    }
    int i=nums.length-1;
    int arr[]=new int[nums.length];
    int l=k;
    while(k>0){
        st.push(nums[i]);
        i--;
        k--;
    }
    for(int z=0;z<i+1;z++){
        arr[z]=nums[z];
    }
    int j=0;
    while(!st.isEmpty()){
        nums[j]=st.pop();
        j++;
    }
    int zz=0;
    for(int z=j;z<nums.length;z++){
        nums[z]=arr[zz];
        zz++;
    }

 }

}
    }
}