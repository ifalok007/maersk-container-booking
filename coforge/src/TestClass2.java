public class TestClass2 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};

        //  5 1 2 3 4

        // 4 5 1 2 3

        // 3 4 5 1 2

        // 2 3 4 5 1

        for( int i= arr.length-1 ; i>=0;i--){
            for( int j = i,k = 0 ; k < arr.length ; j++, k++){
                System.out.println(arr[j % arr.length]);
            }
        }



    }
}
