package Practice;

public class Arrays {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        String numbers = "";
        for (int i = 0; i < nums.length; i++) {
            numbers += "" + nums[i];
            System.out.println(numbers);
            /*
            1
            12
            123
             */
        }
        System.out.println(numbers); //123


        int[] arr = {1,2,3,4,2,7,8,8,3};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }

        for(int i = 0; i < arr.length; i++) { for(int j = i + 1; j < arr.length; j++) { if(arr[i] == arr[j]) { System.out.println(arr[j]); } } }
    }
}
