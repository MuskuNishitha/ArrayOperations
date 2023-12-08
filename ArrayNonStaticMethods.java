public class ArrayNonStaticMethods {
	//insert
	public int[] insert(int a[],int pos,int ele){
		if(pos<1||pos>a.length+1) {
			System.out.println("Insertion not possible");
			return a;
		}
		
		else {
		int res[]=new int[a.length+1];
		for(int i=0,j=0;i<res.length;i++) {
			if(pos-1==i){
				res[i]=ele;	
			}
			else {
				res[i]=a[j++];
			}
		}
		return res;
		}
		
	}
	//delete single element;
	public int[] delete(int a[],int ele){
		int ind=firstOccurance(a,ele);
		if(a.length==0) {
			System.out.println("Array is empty");
			return a;
		}
		else if(ind==-1) {
			System.out.println("deletion not Possible");
			return a;
		}
		else {
			int res[]=new int[a.length-occurence(a,ele)];
			for(int i=0,j=0;i<a.length;i++){
				if(ind!=i) {
					res[j++]=a[i];
				}		
				
			}
			return res;
		}

		
	}
	
	//delete;
	public int[] deleteAll(int a[],int ele){
		int ind=firstOccurance(a,ele);
		if(a.length==0) {
			System.out.println("Array is empty");
			return a;
		}
		else if(ind==-1) {
			System.out.println("deletion not Possible");
			return a;
		}
		else {
			int res[]=new int[a.length-occurence(a,ele)];
			for(int i=0,j=0;i<a.length;i++){
				if(ele!=a[i]) {
					res[j++]=a[i];
				}		
				
			}
			return res;
		}
		
	
	
		
	}
	//occurence;
	public int occurence(int a[],int ele) {
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				c++;
			}
		}
		return c;
	}
//update
public void update(int old_ele,int a[],int new_ele) {
		
		int ind=firstOccurance(a,old_ele);
		if(a.length==0){
			System.out.println("Array is Empty");
		}
		else if(ind==-1) {
			System.out.println("replacing ele is not present in array");
		}
		
		else{
			for(int i=0;i<a.length;i++) {
				if(i==ind){
					a[i]=new_ele;
					break;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}
	//UpdateAll
	public void UpdateAll(int a[],int pos,int Oldele,int newele){
		int ind=firstOccurance(a,Oldele);
		if(a.length==0) {
			System.out.println("Array is Empty");
		}
		else if(ind==-1) {
			System.out.println("Updation Not Possible");
		}
		else {
			for(int i=0;i<a.length;i++) {
				if(a[i]==Oldele) {
					a[i]=newele;
					break;
				}	
			}
			System.out.println(Arrays.toString(a));
		}
	}	
	//FirstOcurance
	public int firstOccurance(int a[],int ele){
		for(int i=0;i<a.length;i++) {
			 if(a[i]==ele) {
			 return i;
			 }
		}
		return -1;
	}
	//Merge//insertall
	public int[] insetAll(int a[],int b[]) {
		int res[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++) {
			res[k]=a[i];
			k++;
			
		}
		for(int i=0;i<b.length;i++) {
			res[k++]=b[i];
			
		}
		return res;
	}
	//firstOccurance
	public int firstOccurance1(int a[],int ele) {
		int ind=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
			return i;
			}			
		}
		return -1;
		
	}
	//lastOccurance;
	public int lastOccurance(int a[],int ele) {
		int ind=-1;
		for(int i=1;i<a.length;i++) {
			if(a[i]==ele) {
				ind=i;
			}
		}
		return ind;
		
	}
	
  //reverse;
	public int[] reverse(int a[]) {
		int rev[]=new int[a.length];
	 for(int i=0,j=a.length-1;i<a.length;i++,j--){
		 rev[i]=a[j];
	 }
	 return rev;
	}
// Accending Sort
	public int[] Accending(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]<a[j]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	
	//decending Sort
	public int[] descending(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]>a[j]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	
	//minimum;
	public int minimum(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
	//maximum;
	public int maximum(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max){
				max=a[i];
			}
		}
		return max;
	}
	//display
	public void display(int a[]) {
		System.out.println(Arrays.toString(a));
	}
	//size;
	public int size(int a[]){
		return a.length;
	}
	//Isempty;
	public boolean isEmpty(int a[]) {
			
		return a.length==0;
	}
	//product
	public int product(int a[]){
		int p=1;
		for(int i=0;i<a.length;i++) {
			p=p*a[i];
		}
		return p;
		
	}
	public int sum(int a[]){
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
		
	}
	public double avg(int a[]){
		return sum(a)/size(a);
	}
	//sum
	// avg
	//Clear;
   public  int[] clear(int a[]) {
	   return new int [0]; 
   }
  
}