//Grind 75
// Week 2, probelm 1

import java.util.*;

public class Queue_Using_Stacks{
	
	public node head;
	
	private class node{
	
		public int value;
		public node next;
		public node(int value){
			this.value = value;
			this.next = null;
		}
	}
	
	public static void main(String[] args){
		Queue_Using_Stacks qus = new Queue_Using_Stacks();
		qus.push(2);
		qus.push(5);
		qus.push(7);
		qus.print();
		System.out.println();
		System.out.println("Peek: " + qus.peek());
		System.out.println("Empty?: " + qus.empty());
		qus.pop();
		qus.pop();
		System.out.println("Peek after 2X pops: " + qus.peek());
		qus.pop();
		System.out.println(qus.empty());
		
	}
	
	private void push(int x){
		if(head == null){
			head = new node(x);
		}
		else{
			node n = new node(x);
			n.next = head;
			head = n;
		}
	}
	
	private int pop(){
		if(head == null){
			throw new EmptyStackException();
		}
		node temp = head;
		head = head.next;
		return temp.value;
	}
	
	private int peek(){
		if(head == null){
			throw new EmptyStackException();
		}
		return head.value;
	}
	
	private boolean empty(){
		if(head == null){
			return true;
		}
		return false;
	}
	
	private void print(){
		printQueue(head);
	}
	
	private void printQueue(node x){
		if(x == null){
			return; 
		}
		System.out.print(x.value + " ");
		printQueue(x.next);
	}
}
