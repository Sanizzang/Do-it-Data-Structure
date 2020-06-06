import java.util.*;

class IntStackTester{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64); //Stack that can push up to 64

		while(true){
			System.out.println("Current data count: " + s.size() + " / " + s.capacity());
			System.out.print("(1)Push (2)Pop (3)Peek " + "(4)Dump (0)Close: ");
			int menu = stdIn.nextInt();
			if(menu == 0) break;

			int x;
			if(menu == 1){
				System.out.print("Data : ");
				x = stdIn.nextInt();
				try{
					s.push(x);
				} catch(IntStack.OverflowIntStackException e){
					System.out.println("Stack is pull");
				}
				break;
			}
			else if(menu == 2){
				try{
					x = s.pop();
				} catch (IntStack.EmptyIntStackException e){
					System.out.println("Stack is empty");
				}
			}
			else if(menu == 3){
				try{
					x = s.peek();
					System.out.println("The peek data is " + x);
				} catch(IntStack.EmptyIntStackException e){
					System.out.println("Stack is empty");
				}
			}
			else if(menu == 4){
				s.dump();
			}
		}
	}
}
