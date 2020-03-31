public class LinkedList {
    private Node top;

    public LinkedList(){
        top = null;
    }

    public void add(Vector2 newNum){     // add method
        Node newNode = new Node(newNum,top);
        top = newNode;
    }

    public String toString(){    // LinkedList toString method
        String returnValue = "";
        Node next = top;

        while (next != null){
            returnValue += next.getLink() + " " + next.getData();
            next = next.getLink();
        }
        return returnValue;
    }

    public int size(){      //get size of linkedlist
        int size = 0;
        for(Node n = top; n.getLink() != null; n = n.getLink()){
            size ++;
        }
        return size;
    }

    public boolean isEmpty(){      // to compare if is empty or not
        if(size() == 0){
            return true;
        }else {
            return false;
        }
    }

    public Node getTop(){
        Node topValue;
        
    }
}
