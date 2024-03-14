public class Lesson4_8 {
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                System.out.println(array[i]);
            }
        }
    }
}
