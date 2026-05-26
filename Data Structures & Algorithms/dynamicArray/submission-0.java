class DynamicArray {
    int arr[];
    int index;
    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.index = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        resize();
        arr[index++] = n;
    }

    public int popback() {
        int ele = arr[index-1];
        index--;
        return ele;
    }

    private void resize() {
        if (this.index == arr.length) {
            int a[] = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                a[i] = arr[i];
            }
            this.arr = a;
        }
    }

    public int getSize() {
        return this.index;
    }

    public int getCapacity() {
        return arr.length;
    }
}
