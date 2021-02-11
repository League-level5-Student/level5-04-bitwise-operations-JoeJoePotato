package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */


	
	public void printByteBinary(byte b) {
		// We first want to print the bit in the one's place
		
		// Shift b seven bits to the right

		// Use the & operator to "mask" the bit in the one's place
		// This can be done by "anding" (&) it with the value of 1

		// Print the result using System.out.print (NOT System.out.println)

		//Use this method to print the remaining 7 bits of b
		

		
		
		System.out.print((b & 0b10000000) >> 7);
		System.out.print((b & 0b01000000) >> 6);
		System.out.print((b & 0b00100000) >> 5);
		System.out.print((b & 0b00010000) >> 4);
		System.out.print((b & 0b00001000) >> 3);
		System.out.print((b & 0b00000100) >> 2);
		System.out.print((b & 0b00000010) >> 1);
		System.out.print((b & 0b00000001) >> 0);
		
		
	}
	
	public void printShortBinary(short s) {
		// Create 2 byte variables
		byte p=00000000;
		byte k=00000000;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
	//00000000
		k+= s& 0b0000000010000000 >> 7;
		k+= s& 0b0000000001000000 >> 6;
		k+= s& 0b0000000000100000 >> 5;
		k+= s& 0b0000000000010000 >> 4;
		k+= s& 0b0000000000001000 >> 3;
		k+= s& 0b0000000000000100 >> 2;
		k+= s& 0b0000000000000010 >> 1;
		k+= s& 0b0000000000000001 >> 0;
		
	p+= s& 0b1000000000000000 >> 15;
	p+= s& 0b0100000000000000 >> 14;
	p+= s& 0b0010000000000000 >> 13;
	p+= s& 0b0001000000000000 >> 12;
	p+= s& 0b0000100000000000 >> 11;
	p+= s& 0b0000010000000000 >> 10;
	p+= s& 0b0000001000000000 >> 9;
	p+= s& 0b0000000100000000 >> 8;

		// Call printByteBinary twice using the two bytes
	printByteBinary(p);
	printByteBinary(k);
		// Make sure they are in the correct order
	}
	
	public void printIntBinary(int i) {
		// Create 2 short variables
		
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
	}
	
	public void printLongBinary(long l) {
		// Use the same method as before to complete this method
	}
	
	public static void main(String[] args) {
		// Test your methods here
BinaryPrinter bip=new BinaryPrinter();
//bip.printByteBinary((byte) 5);
bip.printShortBinary((short) 129);
	}
}
