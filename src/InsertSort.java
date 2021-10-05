public class InsertSort {
    public static void insertSort(int[] arr){
        int post, x;
        for (int i = 0; i < arr.length; i++) {
            x = arr[i];
            post = i;
            while (post > 0 && x < arr[post -1]){
                arr[post] = arr[post -1];
                post--;
            }
            arr[post] = x;
        }
    }
static int[] list = {2,4,6,7,-2,5,-12};
    public static void main(String[] args) {
        insertSort(list);
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i]+" ");
        }
    }
}
