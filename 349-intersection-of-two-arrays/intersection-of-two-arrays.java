class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();

        for(int i=0;i<nums1.length;i++)
        {
            h1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++)
        {
            if(h1.contains(nums2[j]))
            {
                h2.add(nums2[j]);
            }
        }
        int result[]=new int[h2.size()];
        int indx=0;
        
        for(int n:h2)
        {
            result[indx++]=n;
        }
        // System.out.print(h2.get());
        return result;
    }
}