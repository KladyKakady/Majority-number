import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива: ");
        int kolvo = scanner.nextInt();
        int[] arr = new int[kolvo];
        try {
            System.out.println("Введите элементы массива: ");
            for (int i = 0; i < kolvo; i++) {
                if (scanner.hasNextInt()) {
                    arr[i] = scanner.nextInt();
                } else {
                    throw new Exception("Введено нецелое число");
                }
            }

            int candidate = 0;
            int count = 0;
            for (int x : arr) {
                if (count == 0) {
                    candidate = x;
                }
                count += (x == candidate) ? 1 : -1;
            }

            int freq = 0;
            for (int x : arr) {
                if (x == candidate) {
                    freq++;
                }
            }

            if (kolvo > 0 && freq > kolvo / 2) {
                System.out.println("Мажоритарное число: " + candidate);
            } else {
                System.out.println("Мажоритарного числа нет");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}