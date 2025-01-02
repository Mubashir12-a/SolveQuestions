//package Using_Java;

public class First_N_Fibonacci {
    public static void main(String[] args) {
        // 0 + 1 = 1
        //     1 + 1 = 2
        //         1 + 2 = 3
        //             2 + 3 = 5
        //                 3 + 5 = 8 ...so-on

        int First_N_fibbo = 5;

        int num_1 = 0;
        int num_2 = 1;
    
        int [] arr = new int[First_N_fibbo];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i < First_N_fibbo; i++){
            arr[i] = num_1 + num_2;
            num_1 = num_2;
            num_2 = arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
