import java.util.*;

public class LinearSearch
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int ans=-1;
		for(int i=0;i<n;i++){
		    if(x==a[i]){
		        ans=i;
		        break;
		    }
		}
		if(ans==-1){
		    System.out.println("Element not found");
		}
		else{
		    System.out.println("Element is present at "+ans+" position");
		}
	}
}
