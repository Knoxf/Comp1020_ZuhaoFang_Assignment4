public class LinkedList {
    private Node top;

    public LinkedList(){
        top = null;
    }

    public int size(){      //get size of linkedlist
        int size = 1;
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
        if(top == null){
            return null;
        }
        Node topNode = top;
        return topNode;
    }

    public void add(Vector2 newNum){     // add method
        Node newNode = new Node(newNum,top);
        top = newNode;
    }

    public void add(Node newNode){
        Node temp = top;
        temp.setLink(newNode);
    }

    public void addLast(Vector2 data){
        Node temp = top;
        while(temp != null){
            temp = temp.getLink();
        }
        temp.setData(data);
    }

    public Vector2 remove(){
        if(top == null && isEmpty() == true){
            return null;
        }
        Node temp = top;
        top = top.getLink();
        return temp.getData();
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

}
