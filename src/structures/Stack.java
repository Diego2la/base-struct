package structures;

public class Stack<T> {
	
	public Stack() throws StackException {
		init(DEFAULT_STACK_SIZE);
	}
	
	public Stack(int initSize) throws StackException {
		if (initSize < 0) 
			throw new StackException(new String("init size is below zero"));
		if (initSize == 0) init(DEFAULT_STACK_SIZE);
		else init(initSize);
	}
		
	// Copy constructor doesn't create copy of elements here.
	// It means that 2 stacks will have links to the same T objects.
	public Stack(Stack<T> stack) throws StackException {
		int size = stack.size();
		init(size);
	    Object[] temp = new Object[size];
		for (int i = 0; i < size; ++i)
			temp[i] = stack.pop();
		for (int i = size - 1; i >= 0; --i)
		{
			stack.push((T)temp[i]);
			push((T)temp[i]);
		}
	}
	
	public void push(T elem) throws StackException {
		if (idx == pool.length - 1) 
			increaseSize();
		pool[++idx] = elem;
	}
	
	public T pop() throws StackException {
		T t = top();
		--idx;
		return t;
	}
	
	public T top() throws StackException {
		if (idx == -1)
			throw new StackException(new String("stack is empty"));
		return (T)pool[idx];
	}
	
	public int size() {
		return idx + 1; // pool - zero-based array
	}
	
	@Override
	public String toString() {
		String str = new String("Stack(" + pool.length + "):{ ");
		for (int i = 0; i < idx; ++i)
			str += new String("{" + pool[i].toString() + "}, ");
		if (idx >= 0 && idx < pool.length)
			str += new String("{" + pool[idx].toString() + "}");
		str += new String(" }");
		return str;
	}
	
	protected void init(int size) throws StackException {
		idx = -1;
		pool = new Object[size];
	}

	protected void increaseSize() throws StackException {
		Object[] temp = new Object[pool.length * 2];
		for (int i = 0; i < pool.length; ++i)
			temp[i] = pool[i];
		pool = temp;
	}
	
	protected Object[] pool; // stores T[] array
	protected int idx; // index
	
	private final int DEFAULT_STACK_SIZE = 10;
}
