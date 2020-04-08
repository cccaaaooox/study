package com.itheima;

import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int o=sc.nextInt();
		
		int[] a=new int[50] ;
		for(int i=1;i<a.length;i++){
			a[i]=sc.nextInt();
		
		}
		
		aaa(a);
		
		
	}

	public static void aaa(int[] a){
		int b=a[0];
		int c=0;
		for (int i=1;i<a.length;i++){
			if(a[i]<b){
				b=a[i];
				c=i;
			}
		}
		int max=b;
		for(int i2=c;i2<a.length;i2++){
			if(a[i2]>max){
				max=a[i2];
			}
		}
		
		System.out.println(max-b);
	}
	

}
