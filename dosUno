class Node {
  public int data;
  public Node next;
 
  public void displayNodeData() {
    System.out.println("{ " + data + " } ");
  }
}


public class SinglyLinkedList {
  private Node head;
 
  public boolean isEmpty() {
    return (head == null);
  }
 
  // used to insert a node at the start of linked list
  public void insertFirst(int data) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = head;
    head = newNode;
  }
 
  // used to delete node from start of linked list
  public Node deleteFirst() {
    Node temp = head;
    head = head.next;
    return temp;
  }
 
  // used to delete node from start of linked list
  public Node deleteFirst(Node node) {
    Node temp = head;
    head = head.next;
    return temp;
  }
 
  // Use to delete node after particular node
  public void deleteAfter(Node after) {
    Node temp = head;
    while (temp.next != null && temp.data != after.data) {
      temp = temp.next;
    }
    if (temp.next != null)
      temp.next = temp.next.next;
  }
 
  // used to insert a node at the start of linked list
  public void insertLast(int data) {
    Node current = head;
    while (current.next != null) {
      current = current.next; // we'll loop until current.next is null
    }
    Node newNode = new Node();
    newNode.data = data;
    current.next = newNode;
  }
 
 // For printing Linked List
  public void printLinkedList() {
    System.out.println("Printing LinkedList (head --> last) ");
    Node current = head;
    while (current != null) {
      current.displayNodeData();
      current = current.next;
    }
    System.out.println();
  }

  //Deleting without a temp

  public void deleting(){

    Node current = head;
    
    if(head == null ) return;

    while(current != null){
      Node runner = current;

      while (runner.next != null) {
        if(runner.next.data == current.data){
          runner.next = runner.next.next;
        }else{
          runner = runner.next;
        }
      }
      current = current.next;
    }
  }

}


public class Main {
 
	public static void main(String args[]){
   
	   SinglyLinkedList myLinkedlist = new SinglyLinkedList();

	   myLinkedlist.insertFirst(5);
	   myLinkedlist.insertFirst(2);
	   myLinkedlist.insertFirst(3);
	   myLinkedlist.insertFirst(1);
	   myLinkedlist.insertFirst(3);
	   

	   myLinkedlist.printLinkedList();


	   myLinkedlist.deleting();

	   myLinkedlist.printLinkedList();
	}
}




 
