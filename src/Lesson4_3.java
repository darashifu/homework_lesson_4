public class Lesson4_3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int halfLength = array.length / 2;
        for (int i = halfLength; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
