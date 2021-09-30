public class Ex4 {
    static boolean crossingArray(int[] arr) {
        for (int i = 0; i < arr.length - 2; i += 2) {
            if (arr[i] > arr[i + 2]) {
                return false;
            }
        }
        for (int i = 1; i < arr.length - 1; i += 2) {
            if (arr[i] < arr[i + 2]) {
                return false;
            }
        }
        return true;
    }

    static int smallestNumber(int[] arr) {
        if (arr.length % 2 == 0) {
            if (arr[0] < arr[arr.length - 1])
                return arr[0];
            else
                return arr[arr.length - 1];
        } else {
            if (arr[0] < arr[arr.length - 2])
                return arr[0];
            else
                return arr[arr.length - 2];
        }
    }
}
