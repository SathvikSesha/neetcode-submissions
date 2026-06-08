class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mix[] = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                mix[k++] = nums1[i++];
            }
            else{
                mix[k++] = nums2[j++];
            }
        }
        while(i<nums1.length){
            mix[k++] = nums1[i++];
        }
        while(j<nums2.length){
            mix[k++] = nums2[j++];
        }
        int n = mix.length;
        if(n%2==0){
            return (mix[n/2]+mix[n/2-1])/(double)2;
        }
        return mix[n/2];
    }
}
