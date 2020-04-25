import java.util.*;
class Binsearch {  
      public static void main(String args[]) 
    { 
        Binsearch ob = new Binsearch(); 
        System.out.println("Enter the Array Size:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the Sorted Array Element:");
        int []a=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        System.out.println("Enter the Element to search");
        int s=sc.nextInt();
        int f=0;
        int l=n-1;
        int m;
		int c=0;
        for(int i=0;i<n/2;i++) {
			m=(f+l)/2;
        	if(a[m]==s) {
        		System.out.println("The element "+s+" in position "+m);
				c++;
        		break;
        	}
        	else if(a[m]>s) {
        		l=m-1;
				
        	}
        	else {
        		f=m+1;
				
        	}
        }
		if(c==0)
			System.out.print("Please enter the valid Searching Number:");
    } 
}