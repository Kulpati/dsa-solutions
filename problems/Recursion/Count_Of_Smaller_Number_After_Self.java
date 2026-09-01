class Solution {
    int[] count;

    private void divide(int[] nums,int[] index,int[] temp,int l,int r){
        if(l>=r){
            return ;
        }
        int m=l+(r-l)/2;
        divide(nums,index,temp,l,m);
        divide(nums,index,temp,m+1,r);
        merge(nums,index,temp,l,m,r);

    }

    private void merge(int[] nums, int[] index, int[] temp, int l, int m, int r) {
        int i = l;
        int j = m + 1;
        int idx = l;
        int rightcount = 0;
        while (i <= m && j <= r) {
            if (nums[index[i]] > nums[index[j]]) {
                rightcount++;
                temp[idx++] = index[j++];
            } else {
                count[index[i]] += rightcount;
                temp[idx++] = index[i++];
            }
        }
        while (i <= m) {
            count[index[i]] += rightcount;
            temp[idx++] = index[i++];
        }
        while (j <= r) {
            temp[idx++] = index[j++];
        }
        for (int k = l; k <= r; k++) {
            index[k] = temp[k];
        }
    }

    public List<Integer> countSmaller(int[] nums) {
        count = new int[nums.length];
        int index[] = new int[nums.length];
        int temp[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            index[i] = i;
        }
        divide(nums, index,temp, 0, nums.length - 1);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            result.add(count[i]);
        }
        return result;
    }
}