public class MaxArray {
    public static void main(String[] args) {
        int[] array = {10, 23, 5, 17, 8};

        int max = array[0]; 
       
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; 
            }
        }
        System.out.println("largest number : " + max);
    }
}
