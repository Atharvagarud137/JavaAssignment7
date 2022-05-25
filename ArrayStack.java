public class ArrayStack implements Stack {

	public int[] item;
	public int stackTop;

	public ArrayStack(int size) {
		item = new int[size];
		stackTop = 0;
	}

	public void push(int x) throws StackException {
		if (stackTop == item.length) {
			throw new StackException("Stack overflow");
		}

		item[stackTop] = x;
		stackTop++;
	}

	public int pop() throws StackException {
		int returnItem;

		if (stackTop == 0) {
			throw new StackException("Stack underflow");
		}

		returnItem = item[stackTop - 1];
		stackTop--;

		return returnItem;
	}
}
