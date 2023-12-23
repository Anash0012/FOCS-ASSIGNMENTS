import java.util.*;


public class Main
{
    public static int binarySearch(int []a,int x){
    int right=a.length-1;
    int left=0;
    
    while(left<=right){
        int mid=(left+right)/2;
        if(a[mid]==x){
            return mid;
        }
        else if(a[mid]<x){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
    }
    return -1;
}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int ans=binarySearch(a,x);
		if(ans==-1){
		    System.out.println("Element not found ");
		}
		else{
		    System.out.println("Element present at "+ans+" position");
		}
	}
}
