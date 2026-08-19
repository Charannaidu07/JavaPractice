public class Stack {
    int stack[]=new int[5];
    int top=0;
    public void push(int data){
        stack[top]=data;
        top++;
    }

    public void show() {
        for(int n:stack){
            System.out.print(n+" ");
        }
    }

    public void pop() {
        int data;
        top--;
        data=stack[top];
        System.out.println("The poped elt is: "+data);
        stack[top]=0;
    }

    public void peek() {
        int data;
        data=stack[top-1];
        System.out.println("The peeked elt is: "+data);
    }

    public int size() {
        return top;
    }

    public Boolean isEmpty() {
        if(top<=0)
            return Boolean.TRUE;
        return Boolean.FALSE;
    }
}
