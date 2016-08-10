package com.problems.stacksandqueues;

class StackData{
	public int start;
	public int pointer;
	public int size = 0;
	public int capacity;
	public StackData(int start, int capacity){
		this.start = start;
		this.pointer = start - 1;
		this.capacity = capacity;
	}
	
	public boolean isWithinStack(int index, int total_size){
		if(index >= start && index < start+capacity){
			return true;
		}else if(start+capacity > total_size && index < (start+capacity)%total_size){
			return true;
		}else{
			return false;
		}
	}
}

public class Problem2 {
	static int num_of_stacks = 3;
	static int default_size = 4;
	static int total_size = num_of_stacks*default_size;
	static StackData[] stacks = {new StackData(0,default_size),
		new StackData(default_size, default_size),
		new StackData(2*default_size, default_size)
	}; 
	static int[] buffer = new int[total_size];
	public static int numberOfElements(){
		return stacks[0].size+stacks[1].size+stacks[2].size;
	}
	public static int nextElement(int index){
		if(index+1==total_size){
			return 0;
		}else{
			return index+1;
		}
	}
	public static int previousElement(int index){
		if(index == 0){
			return total_size-1;
		}else{
			return index-1;
		}
	}
	public static void shift(int stackNum){
		StackData stack = stacks[stackNum];
		if(stack.size >= stack.capacity){
			int nextStack = (stackNum+1)%num_of_stacks;
			shift(nextStack);
			stack.capacity++;
		}
		for(int i = (stack.start+stack.capacity-1)%total_size; stack.isWithinStack(i,total_size);previousElement(i)){
			buffer[i] = buffer[previousElement(i)];
		}
		
		buffer[stack.start] = 0;
		stack.start = nextElement(stack.start);
		stack.pointer = nextElement(stack.pointer);
		stack.capacity--;
	}
	
	public static void expand(int stackNum){
		shift((stackNum+1)%num_of_stacks);
		stacks[stackNum].capacity++;
	}
	
	public static void push(int stackNum, int value)throws Exception{
		StackData stack = stacks[stackNum];
		if(stack.size >= stack.capacity){
			if(numberOfElements()>total_size){
				throw new Exception("Out of Memory");
			}else{
				expand(stackNum);
			}
		}
		stack.size++;
		stack.pointer = nextElement(stack.pointer);
		buffer[stack.pointer] = value;
	}
	
	public static int pop(int stackNum) throws Exception{
		StackData stack = stacks[stackNum];
		if(stack.size==0){
			throw new Exception("Trying to pop an empty stack.");
		}
		int value = buffer[stack.pointer];
		stack.pointer = 0;
		stack.size--;
		return value;
	}
	
	public static int peek(int stackNum) throws Exception{
		StackData stack = stacks[stackNum];
		if(stack.size==0){
			throw new Exception("Trying to peek an empty stack.");
		}
		int value = buffer[stack.pointer];
		return value;
	}
	public static boolean isEmpty(int stackNum){
		StackData stack = stacks[stackNum];
		if(stack.size==0) return true;
		return false;
	}
}
