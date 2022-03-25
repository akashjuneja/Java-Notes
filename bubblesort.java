/**
 * bubblesort
 */
public class bubblesort {

    public static void main(String args[]){
        System.out.println("Bubble Sort");
        int arr[]={7,8,1,5,2,3};
        sort(arr);
    }

    public static void sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(arr);
        for(int x : arr){
            System.out.println(x);
        }
    }
}