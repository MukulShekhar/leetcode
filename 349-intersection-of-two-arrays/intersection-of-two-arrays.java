class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ms=new HashSet<>();
        Set<Integer> ss=new HashSet<>();
        for(int e:nums1){
            ms.add(e);
        }
        for(int e:nums2){
            ss.add(e);
        }
        ms.retainAll(ss);
        int res[]=new int[ms.size()];
        int i=0;
        for(int e:ms){
            res[i]=e;
            i++;
        }
        return res;
    }
}