public class Ex9 {
    static boolean isFullArray(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("array is invalid");
        }
        int i;
        int min = arr[0];
        int max = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        if (arr.length != max - min + 1) {
            return false;
        }
        boolean found;
        for (int num = min; num <= max; num++) {
            found = false;
            for (i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    static boolean isFullArrayRisingOrder(int[] arr) {
        int range = arr[arr.length - 1] - arr[0] + 1;
        return range == arr.length;
    }

    public static void main(String[] args) {

        int[] a = { 23, 30, 24, 29, 25, 28, 26, 31, 27 };
        System.out.println(isFullArray(a));
        System.out.println(isFullArrayRisingOrder(a));

    }
}
