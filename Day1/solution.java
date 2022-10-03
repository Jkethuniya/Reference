class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans;
        int n1= nums1.length;
        int n2= nums2.length;
        int i=0, j=0,k=0;
        int[] arr3 = new int[n1+n2];
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                arr3[k++]=nums1[i++];
            }else{
                arr3[k++] = nums2[j++];
            }
        }
        while(i<n1){
            arr3[k++] = nums1[i++];
        }
        while(j<n2){
            arr3[k++] = nums2[j++];
        }
        if(arr3.length%2==1){
            ans = arr3[arr3.length/2];
        }else{
            ans = arr3[(arr3.length/2)] +  arr3[(arr3.length/2)-1];
            ans = ans/2;
        }

        return ans;
        }

    }
