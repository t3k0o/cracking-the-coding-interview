public void findK(int position){

    int counter = 0;
    int real = 0;

    Node temp = head;

    while(head != null){
      counter++;
      head = head.next;
    }
    
    counter -=  1;
    real = counter - position;
    
    for (int i = 0; i <= real ;i++ ) {
      if(i == real)
        temp.displayNodeData();
      temp = temp.next;
    }

    System.out.println("Size: "+counter+" real:"+real);
  }
