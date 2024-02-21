class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute(0, nums, ans);
        return ans;
    }
    public void recurPermute(int ind, int nums[], List<List<Integer>> ans)
    {
        //base condition & declare ds and copy them to the ans
        if(ind == nums.length)
        {   List<Integer> ds = new ArrayList<>();
            for(int i = 0;i<nums.length;i++)
            {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        //now go through the looping condition
        for(int i=ind;i<nums.length;i++)
        {
            swap(i, ind, nums);
            recurPermute(ind+1, nums, ans);
            swap(i, ind, nums);//reswap the nos so that during returning it will be same
        }
    }
    public void swap(int i, int j,int nums[])
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}