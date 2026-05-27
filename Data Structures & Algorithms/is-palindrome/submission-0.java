class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char a = Character.toLowerCase(s.charAt(i));
            char b = Character.toLowerCase(s.charAt(j));
            boolean as = Character.isLetterOrDigit(a);
            boolean bs = Character.isLetterOrDigit(b);
            if(!as && !bs){
                i++;
                j--;
                continue;
            }
            else if(!as){
                i++;
                continue;
            }
            else if(!bs){
                j--;
                continue;
            }
            else if(a!=b){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
