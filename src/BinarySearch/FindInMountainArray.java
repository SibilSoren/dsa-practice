package BinarySearch;

interface MountainArray {
    public int get(int index);
    public int length();
}

public class FindInMountainArray {

    public static void main(String[] args) {
        // mock implementation for testing
        MountainArray mountainArr = new MountainArray() {
            private int[] arr = {1, 3, 5, 7, 6, 4, 2};
            public int get(int index) { return arr[index]; }
            public int length() { return arr.length; }
        };

        int target = 6;
        int index = findInMountainArray(target, mountainArr);
        System.out.println("Target found at index: " + index);
    }

    static int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int leftSearch = search(mountainArr, target, 0, peak, true);
        if (leftSearch != -1) return leftSearch;
        return search(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    static int findPeak(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int search(MountainArray mountainArr, int target, int start, int end, boolean isLeft) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int value = mountainArr.get(mid);

            if (value == target) return mid;

            if (isLeft) {
                if (value > target) end = mid - 1;
                else start = mid + 1;
            } else {
                if (value < target) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}
