package com.rsp;



public class Array {
	public static void main(String[] args) {
		
		int a[]= {5,4,81,3,9,7,23,32,8,12,22};
		
		for (int i = 0; i <a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i] < a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;		
				}
			}
		}
		for (int i : a) {
			if(i%2==0)
			System.out.print(i+" ");	
		
		} 
		//FOR ODD NO IN DESSENDING ORDER
			for (int i = 0; i <a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if(a[i] > a[j]) {
						int t=a[i];
						a[i]=a[j];
						a[j]=t;		
					}
				}
			}
				
			for (int i : a) {
			if(i%2!=0)
			System.out.print(i+" ");	
		}
	} 
}	 


		
			
			