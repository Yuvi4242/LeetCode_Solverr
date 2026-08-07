class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        // int cnt1=0;
        // int cnt2=0;
        // for(int x:nums1){
        //     for(int y:nums2){
        //         if(x==y){
        //             cnt1++;
        //             break;
        //         }
        //     }
        // }
        // for(int x:nums2){
        //     for(int y:nums1){
        //         if(x==y){
        //             cnt2++;
        //             break;
        //         }
        //     }
        // }
        // return new int[]{cnt1,cnt2};
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int x:nums1){
            set1.add(x);
        }
        for(int x:nums2){
            set2.add(x);
        }
        int cnt1=0,cnt2=0;
        for(int x:nums1){
            if(set2.contains(x)) cnt1++;
        }
        for(int x:nums2){
            if(set1.contains(x)) cnt2++;
        }
        return new int[]{cnt1,cnt2};
    }
}
