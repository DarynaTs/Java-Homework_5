public class Main {
    public static void main(String[] args) {
        int[] arr = new int[7];

        double[] arr2 = new double[8];

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr5 = {1, 2, 3, 4, 5, 6, 7,8, 9,10,11,12};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 0.5;
        }
        print(arr1);
        print2(arr2);
        loop(50, 10);
        task3(arr5);
        task4(arr5);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void print2(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void loop(int a, int b) {

        for (int i = 0; i < 100; i++) {
            if (a < 10)
                break;
            System.out.println(a);
            a = a - b;
        }
    }
        public static void task3(int[] arr5) {
               for(int i=0;i < arr5.length;i++) {
                   if(arr5[ i] % 3 == 0)
                   {
                       System.out.println(arr5[i]);
                   }
               }
            }

    public static void task4(int[] arr5) {
        for(int i=1;i < arr5.length;i++) {
            if(arr5[i] % 2 != 0) {
                System.out.println(arr5[arr5.length - i]);
            }

        }
    }

}
