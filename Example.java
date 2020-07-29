class Node{
	int data;
	Node next;
	Node(int data){this.data=data;}	
}
class Stack{
	Node top;
	public void push(int data){
		Node node=new Node(data);
		node.next=top;
		top=node;
	}
	public void pop(){
		if(top!=null){
			top=top.next;
		}
	}
	public void printStack(){
		Node temp=top;
		System.out.print("[");
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println("\b\b]");
	}
}
class Example{
	public static void main(String args[]){
		Stack s1=new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.printStack();
		
		s1.pop();
		s1.printStack();
		
		s1.push(99);
		s1.printStack();
		
	}
}
