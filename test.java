import java.util.Arrays;
import java.lang.System;

public class test {
	//查找元素在数组中的位置
	/*public static int indexof(int[] a,int v){
		for(int i=0;i<a.length;i++){
			if(a[i]==v){
				return i;
			}
		}
		return -1;
	}*/
	//将数组a中的元素复制len个到数组b中
	/*public static int[] copyof(int[] a, int len){
		int[] b=new int [len];
		//if(len<a.length){
			for(int i=0;i<a.length;i++){
				b[i]=a[i];
			}
		}
		else{
			for(int j=0;j<a.length;j++){
				b[j]=a[j];
			}
			for(int m=a.length;m<len;m++){
				b[m]=0;
			}
		}
		return b;
	} */
	//二分查找
	/*public static int binarySearch(int a[],int v){
		int low=0;
		int high=a.length-1;
		int mid=0;
		while(low<=high){
			mid=(low+high)/2;
			if(v<a[mid]){
				high=mid-1;
			}
			if(v>a[mid]){
				low=mid+1;
			}
			if(v==a[mid]){
				return mid;
			}
		}
		return -1;
	}*/
	//冒泡排序-最大的数依次沉到最下面
	/*public static int[] Bobolsort(int a[]){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}*/
	//冒泡排序——优化
	/*public static void Bobolsort(int a[]){
		for(int i=0;i<a.length;i++){
			boolean sorted=false;
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					sorted=true;
				}
			}
			if(sorted==false){
					return;
			}
		}
	}*/
	//去掉一个最大数和一个最小数的平均值
	/*public static double average(int[] a){
		int sum=0;
		Bobolsort(a);
		for(int i=1;i<a.length-1;i++){
			sum+=a[i];
		}
		return (double)sum/(a.length-2);
		
	}*/
	//数组右旋K个数字
	/*public static void rotate(int[] num,int k){
		k=k%num.length;
		int [] right=Arrays.copyOfRange(num,num.length-k,num.length);
		System.arraycopy(num,0,num,k,(num.length-k));
		System.arraycopy(right,0,num,0,k);
		/*int len=k;
		int key=0;
		if(k>num.length){
		    len=k%num.length;
		}
		for(int i=0;i<len;i++){
			key=num[0];
			for(int j=0;j<num.length-1;j++){
				num[j]=num[j+1];
			}
			num[num.length-1]=key;
		}
	}*/
	//冒泡排序—最小的数依次升到最上面
	/*public static int[] Bobolsort(int[] a ){
	          for(int i=0;i<a.length;i++){
				  for(int j=a.length-1;j>i;j--){
					  if(a[j]<a[j-1]){
						int temp=a[j];
						a[j]=a[j-1];
						a[j-1]=temp;
				}
				  }
			  }
			  return a;
	}*/
	//偶数在前面，奇数在后面
	/*public static int[] partitionl(int[] num){
		int m=0;
		for(int i=0;i<num.length;i++){
			if(num[i]%2==0){
				int temp=num[i];
				num[i]=num[m];
				num[m]=temp;
				m++;
			}
		}
		/*int left=0;
		int right=num.length-1;
		while(left<right){
			while(num[left]%2==0&&left<right){
				left++;
			}
			while(num[right]%2!=0&&left<right){
				right--;
			}
			int temp=num[left];
			num[left]=num[right];
			num[right]=temp;
		}
		return num;
	}*/
	public static void main(String[] args){
		System.out.println('a'+'b');
		System.out.println("a"+"b");
		//int[] a={1,2,3,4,5};
		//System.out.println(average(a));
		//partitionl(a);
		//rotate(a,7);
		//for(int j:a){
		//	System.out.print(j+" ");
		//}
		/*System.out.println("排序前：");
		System.out.println(Arrays.toString(a));
		Bobolsort(a);
		System.out.println("排序后：");
		System.out.println(Arrays.toString(a));*/
		//System.out.println(indexof(a,2));
		//int s[]=copyof(a,10);
		//for(int j=0;j<b.length;j++){
		//	System.out.print(b[j]+" ");
		//}
		//for(int j:b){
		//	System.out.print(j+" ");
		//}
		//System.out.ptrintln(Arrays.toString(a));
		/*if(binarySearch(a,2)!=-1){
		System.out.println("已找到,位置是："+binarySearch(a,2));
		}
		else{
			System.out.println("未找到");
		}*/
		//System.out.println(binarySearch(a,28));
		
	}
}