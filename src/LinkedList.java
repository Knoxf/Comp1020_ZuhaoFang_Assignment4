public class LinkedList {

    private Node top;

    public void add(Vector2 newNum){
        Node newNode = new Node(newNum,top);
        top = newNode;
    }

    public String toString(){
        String returnValue = "";
        Node next = top;

        while (next != null){
            returnValue += next.getLink() + " " + next.getData();
            next = next.getLink();
        }
        return returnValue;
    }
}
