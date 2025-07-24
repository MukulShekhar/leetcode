class Solution {
    public int compareVersion(String version1, String version2) {
        String[] part1=version1.split("\\.");
        String[] part2=version2.split("\\.");
        int maxl=Math.max(part1.length,part2.length);
        for(int i=0;i<maxl;i++){
            int n1=i<part1.length ? Integer.parseInt(part1[i]):0;
            int n2=i<part2.length ? Integer.parseInt(part2[i]):0;
            if(n1>n2) return 1;
            if(n1<n2) return -1;
        }
        return 0;
    }
}