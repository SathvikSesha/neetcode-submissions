class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        String arr[] = new String[digits.length()];
        int i = 0;
        for (char ch : digits.toCharArray()) {
            arr[i++] = map.get(ch - '0');
        }
        List<String> a = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        rec(a,arr,0,str);
        return a;
    }
    public void rec(List<String> a,String arr[],int ind,StringBuilder str){
        if(ind==arr.length){
            a.add(str.toString());
            return;
        }
        for(char ch:arr[ind].toCharArray()){
            str.append(ch);
            rec(a,arr,ind+1,str);
            str.deleteCharAt(str.length()-1);
        }
    }
}
