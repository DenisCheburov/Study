package lesson;

public class main {


        public static void main(String[] args) {
            invertArray();
            fillArray();
            changeArray();
            fillDiagonal();
        }

        public static void invertArray() {
            int[] arr = {1, 0, 1, 0, 0, 0, 1, 1, 1, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr[i] = 1;

                } else {
                    arr[i] = 0;
                }
                System.out.println(arr[i]);

            }
        }

        public static void fillArray() {
            int[] arr = new int[8];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i * 3;
                System.out.println(arr[i]);
            }


        }

        public static void changeArray() {
            int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 6) {
                    array[i] *= 2;
                }

                System.out.println(array[i]);
            }
        }

        public static void fillDiagonal() {
            int[][] arr = new int[4][4];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i == j || i == arr.length - j - 1) {
                        arr[i][j] = 1;
                    }


                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

