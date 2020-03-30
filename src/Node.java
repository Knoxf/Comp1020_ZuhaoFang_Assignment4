public class Node {

    private Vector2 data;
    private Node link;

    public Node(Vector2 data, Node link){
        this.data = data;
        this.link = link;
    }

    public Vector2 getData(){return data;}

    public Node getLink(){
        return link;
    }

    public void setData(Vector2 num){
        data = num;
    }

    public void setLink(Node n){
        link = n;
    }

    public String toString(){
        String returnStr = "";
        returnStr = returnStr + link + "(" + data + ")";
        return returnStr;
    }

}
