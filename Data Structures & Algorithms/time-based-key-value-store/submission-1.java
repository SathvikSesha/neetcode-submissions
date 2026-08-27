class TimeMap {
    Map<String, List<Value>> map;
    public TimeMap() {
        this.map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            List<Value> l = new ArrayList<>();
            l.add(new Value(value, timestamp));
            map.put(key, l);
        } else {
            map.get(key).add(new Value(value, timestamp));
        }
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key))
            return "";
        List<Value> l = map.get(key);
        int start = 0;
        int end = l.size() - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (l.get(mid).timestamp <= timestamp) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res == -1 ? "" : l.get(res).value;
    }
}

class Value {
    String value;
    int timestamp;
    public Value(String value, int timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }
}
