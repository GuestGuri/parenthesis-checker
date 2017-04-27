
public class Stack{
	
	public char []par;
	public int head;
	public int size;
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	public Stack(int size) {
		super();
		this.size = size;
		this.par = new char[size];
		this.head = 0;
	}
	
	public boolean isFull(){
		if(head == size){
			return true;
		}
		return false;
	}
	
	public boolean isEmpty(){
		if(head == 0){
			return true;
		}
		return false;
	}
	
	public void push(char c){
		while(!isFull()){
			par[head] = c;
			head++;
			break;
			}
		}
	
	public void pop(){
		while(!isEmpty()){
			head--;
			break;
		}
	}
	
	public void view(){
		for(int i = 0; i < head; i++){
			System.out.println(par[i]);
		}
	}
	
}