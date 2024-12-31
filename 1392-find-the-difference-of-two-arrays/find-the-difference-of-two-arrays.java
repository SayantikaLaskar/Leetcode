class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list= new ArrayList<>();
        HashSet<Integer> hm = new HashSet<>();
        HashSet<Integer> hm1 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hm.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            hm1.add(nums2[i]);
        }
        List<Integer> l=new ArrayList<>();
        for(int i:hm){
            if(!hm1.contains(i)){
                l.add(i);
            }
        }
        list.add(l);
        List<Integer> li = new ArrayList<>();
        for(int i:hm1){
            if(!hm.contains(i)){
                li.add(i);
            }
        }
        list.add(li);
        return list;
    }
}