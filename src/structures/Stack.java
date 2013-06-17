package structures;

import java.lang.reflect.Array;

public class Stack<T> {
	
	public Stack() throws StackException {
		init(DEFAULT_STACK_SIZE);
	}
	
	public Stack(int init_size) throws StackException {
		if (init_size <= 0) 
			throw new StackException(new String("init size is below zero or zero"));
		init(init_size);		
	}
		
	public Stack(Stack<T> stack) throws StackException {
		int size = stack.size();
		init(size);
		// Here better create new class StackInterface without access to stack data
		// and make public access to pool here.
		// In this case we can optimize code under comment.
		T[] temp = newArray(size);
		for (int i = 0; i < size; ++i)
			temp[i] = stack.pop();
		for (int i = size - 1; i >= 0; --i)
		{
			stack.push(temp[i]);
			push(temp[i]);
		}
	}
	
	public void push(T elem) throws StackException {
		if (classType == null) {
			classType = (Class<T>)elem.getClass();
			// first creation of array
			pool = newArray(init_size);
		}
		if (idx == pool.length - 1) increaseSize();
		pool[++idx] = elem;
	}
	
	public T pop() throws StackException {
		if (idx == 0)
			throw new StackException(new String("stack is empty"));
		return pool[idx--];
	}
	
	public T top() throws StackException {
		if (idx == 0)
			throw new StackException(new String("stack is empty"));
		return pool[idx];
	}
	
	public int size() {
		return pool.length;
	}
	
	protected void init(int size) throws StackException {
		idx = 0;
		init_size = size;
		pool = null;
		classType = null;
	}

	protected void increaseSize() throws StackException {
		T[] temp = newArray(pool.length * 2);
		for (int i = 0; i < pool.length; ++i)
			temp[i] = pool[i];
		pool = temp;
	}
	
	protected T[] newArray(int size) throws StackException {	
		Class<T> c = classType;
		try {
			c.newInstance();
		} catch (InstantiationException|IllegalAccessException e) {
			throw new StackException(new String("cannot create instance of class T"));
		} 
		return (T[]) Array.newInstance(c,size);
	}
	
	protected T[] pool;
	protected int idx;
	protected int init_size;
	protected Class<T> classType;
	
	private final int DEFAULT_STACK_SIZE = 10;
}
