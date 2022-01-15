package recursion;

public class Search {

    public static void main(String[] args) {

        int[] arr = {1,4,7,2,8,9};

        int ele = 2;

        System.out.println(search(arr, ele, 0));;

    }

    private static boolean search(int[] arr, int ele, int currIndex) {

        // Base case
        if(currIndex == arr.length) {
            return false;
        }

//        if( ele == arr[currIndex]) {
//            return true;
//        } else {
//            return search(arr, ele, currIndex + 1);
//        }

        return (ele == arr[currIndex] || search(arr, ele, currIndex + 1));
    }

}
