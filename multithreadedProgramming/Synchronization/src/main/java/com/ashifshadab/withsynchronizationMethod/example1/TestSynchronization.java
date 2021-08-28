package com.ashifshadab.withsynchronizationMethod.example1;

/**
 * This will not work because each Object is different,
 * 
 * Synchronized block decides which threads to stop based on the object that you pass to it. 
 * The object that you pass serves as the identifier of the monitor section guarded by the synchronized block.
 * You may have many monitor sections in your program, 
 * all of which could be executed concurrently with each other. 
 * For example, if you have two unrelated collections that must be accessed concurrently, 
 * you can set up separate monitor sections for each collection. 
 * This way threads would be stopped only when other threads are already accessing the same collection; 
 * two different threads accessing two different collections would be allowed to proceed concurrently.
 * 
 * Notice how the two threads, threadA and threadB, 
 * no longer reference the same Table instance. 
 * The add method of table1 and table2 are synchronized on their two owning instances. 
 * Calling printTable() on table1 will thus not block a call to printTable() on table2.
 * 
 * **/

public class TestSynchronization {

	public static void main(String[] args) {
		
		Table table1 = new Table("Raj", 2);
		
		Table table2 = new Table("Mohan", 3);

		Thread threadA = new Thread(table1);
		
		Thread threadB = new Thread(table2);
		
		threadA.start();
		
		threadB.start();
		

	}

}
