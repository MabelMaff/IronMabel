public class Tasks {

    // Task 1
    public static int differenceMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    // Task 2
    public static void printTwoSmallest(int[] array) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < first) {
                second = first;
                first = num;
            } else if (num < second && num != first) {
                second = num;
            }
        }
        System.out.println("Smallest: " + first + ", Second smallest: " + second);
    }

    // Task 3
    public static double calculateExpression(double x, double y) {
        double part = (4 * y / 5) - x;
        return Math.pow(x, 2) + Math.pow(part, 2);
    }

    public static void main(String[] args) {
        // Aquí puedes probar tus métodos si quieres
        int[] nums = {7, 2, 9, 4};
        System.out.println("Difference: " + differenceMaxMin(nums));
        printTwoSmallest(nums);
        System.out.println("Expression: " + calculateExpression(3, 5));
    }
}
