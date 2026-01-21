class Stack {

private class Node {
int data;
Node next;

Node(int data) {
this.data = data;
this.next = null;
}
}
Node top;// pointers

int size;
int maxSize;
Stack(int maxSize) {
this.top = null;
this.size = 0;
this.maxSize = maxSize;
}
public int append(int a) {
if (size == maxSize) {
System.out.println("Stack overflow");
return -1;
}
Node newNode = new Node(a);
newNode.next = top;
top = newNode;
size++;
return a;
}
public int pop() {
if (top == null) {
System.out.println("Stack underflow");
return -1;
}
int popped = top.data;
top = top.next;
size--;
return popped;
}
public void currstateStack() {
System.out.println("top is at " + (size - 1));
System.out.print("[");
Node temp = top;
while (temp != null) {
System.out.print(temp.data + ",");
temp = temp.next;
}
System.out.println("]");
}
public void travarsal() {
if (top == null) {
System.out.println("Stack is empty");
return;
}
System.out.println("Stack");
Node temp = top;
while (temp != null) {
System.out.println(temp.data);
temp = temp.next;
}
}
}
class Main {
public static void main(String[] args) {
Stack s = new Stack(5);
s.currstateStack();
System.out.println(s.append(10));
System.out.println("----After appending 10 -----");
s.currstateStack();
System.out.println(s.append(17));
System.out.println("----After appending 17 -----");
s.currstateStack();
System.out.println(s.append(18));
System.out.println("----After appending 18 -----");
s.currstateStack();
System.out.println(s.append(19));
System.out.println("----After appending 19 -----");
s.currstateStack();
System.out.println(s.append(20));
System.out.println("----After appending 20 -----");
s.currstateStack();

s.travarsal();
}
}
