class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] s1e=new char[]{s1.charAt(0),s1.charAt(2)};
        char[] s1o=new char[]{s1.charAt(1),s1.charAt(3)};
        char[] s2e=new char[]{s2.charAt(0),s2.charAt(2)};
        char[] s2o=new char[]{s2.charAt(1),s2.charAt(3)};
        Arrays.sort(s1e);
        Arrays.sort(s2e);
        Arrays.sort(s1o);
        Arrays.sort(s2o);
        return Arrays.equals(s1e,s2e) && Arrays.equals(s1o,s2o);
    }
}