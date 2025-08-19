public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n=arr.length;
        for (int i=0; i<arr.length-1;i++) {
            for (int j=0; j<arr.length-i-1;j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j + 1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {20, 40, 30, 60, 10};
                System.out.println("Array before sorting");
                for(int i:arr) {
                    System.out.print(i+" ");
                }
                System.out.println();
                bubbleSort(arr);
        System.out.println("Array after sorting");
            for (int j:arr) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

