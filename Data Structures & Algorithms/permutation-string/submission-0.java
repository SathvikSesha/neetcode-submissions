class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int arr[] = new int[26];
        for(char ch:s1.toCharArray()){
            arr[ch-'a']++;
        }
        int m = s2.length();
        int i = 0;
        int a[] = new int[26];
        for(int j = 0;j<m;j++){
            a[s2.charAt(j)-'a']++;
            if(j-i+1>n){
                a[s2.charAt(i)-'a']--;
                i++;
            }
            if(Arrays.equals(a,arr)) return true;
        }
        return false;
    }
}
