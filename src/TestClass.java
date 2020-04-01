public class TestClass {

    public static void main(String[] args){
        LinkedList testElement = new LinkedList();
        Vector2 test = new Vector2(1,2);
        Vector2 test1 = new Vector2(3,4);
        Vector2 test2 = new Vector2(5,6);
        testElement.add(test);
        testElement.add(test1);
        testElement.add(test2);
        System.out.println(testElement.size());
        System.out.println(testElement.toString());

        if(testElement.isEmpty()){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
