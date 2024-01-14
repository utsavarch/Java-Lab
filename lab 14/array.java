public class array {
    public static void main(String[] args) {
        // Task 1: Access element 7 in the multi-dimensional array
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int element7 = myNumbers[1][2];
        System.out.println("Task 1: Access element 7 - " + element7);

        // Task 2: Change the value of 7 to 9 in the array
        myNumbers[1][2] = 9;
        System.out.println("Task 2: Change value of 7 to 9 - " + myNumbers[1][2]);

        // Task 3: Loop through the array using for-each
        System.out.println("Task 3: Loop through the array using for-each");
        for (int[] row : myNumbers) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
