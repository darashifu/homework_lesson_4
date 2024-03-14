public class Lesson4_7 {
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};

        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] < 0) {
                negativeCount++;
            }
        }

        System.out.println(positiveCount);
        System.out.println(negativeCount);
    }
}
