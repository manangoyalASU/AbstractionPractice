package com.Manan.PolymorphismPractice;

public class LinkedList {
	
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public static LinkedList insert(LinkedList list, int data) {
		Node new_node = new Node(data);
		
		if (list.head == null) {
			list.head = new_node;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	
	public static void printList(LinkedList list) {
		Node currNode = list.head;
		System.out.print("LinkedList: ");
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}
	
	public static LinkedList deleteByKey(LinkedList list, int key) {
		
		Node currNode = list.head;
		Node prev = null;
		
		// case 1
		if (currNode != null && currNode.data == key) {
			list.head = currNode.next;
			System.out.println(key + " found and deleted");
			return list;
		}
		
		// case 2
		while (currNode != null && currNode.data != key) {
			prev = currNode;
			currNode = currNode.next;
		}
		
		if (currNode != null) {
			prev.next = currNode.next;
			System.out.println(key + " found and deleted");
		}
		
		// case 3
		if (currNode == null) {
			System.out.println(key + " not found");
		}
		return list;
		
	}
	
	public static LinkedList deleteAtPosition(LinkedList list, int index) {
		Node currNode = list.head, prev = null;
		
		// case 1
		if (index == 0 && currNode != null) {
			list.head = currNode.next;
			System.out.println(index + " position element deleted");
			return list;
		}
		
		// case 2
		int counter = 0;
		while (currNode != null) {
			if (counter == index) {
				prev.next = currNode.next;
				System.out.println(index + " position element deleted");
				break;
			} else {
				prev = currNode;
				currNode = currNode.next;
				counter++;
			}
		}
		
		// case 3
		if (currNode == null) {
			System.out.println(index + " position element not found");
		}
		return list;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list=insert(list, 1);
		list=insert(list, 2);
		list=insert(list, 3);
		list=insert(list, 4);
		list=insert(list, 5);
		list=insert(list, 6);
		list=insert(list, 7);
		list=insert(list, 8);
		
		printList(list);
		
		deleteByKey(list, 1);
		printList(list);
		
		deleteByKey(list, 4);
		printList(list);
		
		deleteByKey(list, 10);
		printList(list);
		
		deleteAtPosition(list, 0);
		printList(list);
		
		deleteAtPosition(list, 2);
		printList(list);
		
		deleteAtPosition(list, 10);
		printList(list);
	}
	
}





/*
 * public static void main(String[] args) {
 * 
 * 		BinarySearch ob = new BinarySearch();
 * int[] arr = {2,3,4,10,40};
 * int n = arr.length;
 * int x = 10;
 * int result = ob.BinarySeach(arr, 0, n-1, x);
 * if (result == -1) {
 * 	System.out.println("Element not present");
 * } else {
 * 	System.out.println("Element found at index " + result);
 * }
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
