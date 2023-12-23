import java.util.*;

public class Main {

    public static void quickSort(int a[], int l, int h) {
        if (l < h) {
            int partitionIndex = partition(a, l, h);

            quickSort(a, l, partitionIndex - 1);
            quickSort(a, partitionIndex + 1, h);
        }
    }

    static int partition(int a[], int l, int h) {
        int pivot = a[h];

        int i = l - 1;

        for (int j = l; j < h; j++) {
            if (a[j] <= pivot) {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[h];
        a[h] = temp;

        return i + 1;
    }

    public static void print(int a[]) {
        int n = a.length;
        for (int ele:a) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        quickSort(a,0,n-1);

        System.out.println("Sorted array:");
        print(a);
    }
}

