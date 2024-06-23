package Assignment;

public class DoubleExist {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        System.out.println(doubleExist(arr));
    }

    static boolean doubleExist(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i !=j && arr[i] == 2 * arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
