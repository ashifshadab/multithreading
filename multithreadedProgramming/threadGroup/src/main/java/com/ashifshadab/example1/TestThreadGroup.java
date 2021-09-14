package com.ashifshadab.example1;

public class TestThreadGroup {

	public static void main(String[] args) {

		System.out.println("Name of thread :: "+ Thread.currentThread().getName());
		
		System.out.println("Name of thread Group:: "+ Thread.currentThread().getThreadGroup().getName());
		
		System.out.println("Name of thread Group's parent:: "+ Thread.currentThread().getThreadGroup().getParent());
		
		System.out.println("Name of thread Group's parent name:: "+ Thread.currentThread().getThreadGroup().getParent().getName());

	}

}
