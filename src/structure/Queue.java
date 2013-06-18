// Author : Tyurin Dima
// E-mail : tyurin94@gmail.com
// Our symbol: Leonid Novikov

package structure;

public class Queue<T> {
	
	public Queue() {
		list = new TwoLinkedList<T>();
	}
	
	public void push(T elem) {
		list.pushFront(elem);
	}
	
	public T pop() {
		return list.popEnd();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
	
	protected TwoLinkedList<T> list;
	
}
