public class Lesson4_9 {
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};

        int maxElement = array[0];
        int minElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            } else if (array[i] < minElement) {
                minElement = array[i];
            }
        }

        System.out.println(maxElement);
        System.out.println(minElement);
    }
}
