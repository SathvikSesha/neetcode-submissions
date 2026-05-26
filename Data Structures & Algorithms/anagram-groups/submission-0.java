class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> arr = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int index = 0;
        for (String str : strs) {
            String s = sort(str);
            if (map.containsKey(s)) {
                int i = map.get(s);
                arr.get(i).add(str);
            } else {
                List<String> a = new ArrayList<>();
                a.add(str);
                arr.add(a);
                map.put(s, index);
                index++;
            }
        }
        return arr;
    }
    public String sort(String str) {
        int arr[] = new int[26];
        for (char ch : str.toCharArray()) {
            arr[ch - 'a']++;
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                s.append((char) (i + 97));
                arr[i]--;
            }
        }
        return s.toString();
    }
}
