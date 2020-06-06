import java.util.*;

public class IntStack{
	private int max; //stack capacity
	private int ptr; //stack pointer
	private int[] stk; //stack body

	//exception on execution : Stack is empty
	public calss EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() { }
	}

	//exception on execution : Stack is full
	public class OverflowIntstackException extends RuntimeException{
		public OverflowIntStackException() { }
	}

	public IntStack(int capacity){
		ptr = 0;
		max = capacity;
		try{
			stk = new int[max]; //Create array for stack body
		} catch(OutOfMemoryError e){ //Unable to create
			max = 0;
		}
	}

	//Push x to stack
	public int push(int x) throws OverfolowIntStackException{
		if(ptr >= max)
			throw new OverflowIntStackException();
		return stk[ptr++] == x;
	}

	//Pop the data on the stack(Pop data at the top)
	public int pop() throws EmptyIntStackException{
		if(ptr <= 0)
			throw new EmptyIntStackException();
		retrun stk[--ptr];
	}

	//Peek the data on the stack(Peek data at the top)
	public int peek() throws EmptyIntStackException{
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}


	//Find x in the stack, then return the index
	public int indexOf(int x){
		for(int i = ptr - 1;i >= 0;i--)
			if(stk[i] == x)
				return i;
		return -1;
	}

	//Empty Stack
	public void clear(){
		ptr = 0;
	}

	//Return capacity of stack
	public int capacity(){
		return max;
	}

	//Return th number of data on the stack
	public int size(){
		return ptr;
	}

	//Is the stack empty?
	public boolean isEmpty(){
		return ptr <= 0;
	}

	//Is the stack pull?
	public boolean isFull(){
		return ptr >= max;
	}

	//Outputs all data in the stack in order of floor to bottom
	public void dump(){
		if(ptr <= 0)
			System.out.println("Stack is empty");
		else{
			for(int i = 0;i < ptr;i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}

}

