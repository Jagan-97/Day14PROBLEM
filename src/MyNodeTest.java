public class MyNodeTest extends MyNodeMain {
    public static void given3NumberWhenLinkedShouldPassedLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        System.out.println(myFirstNode);
        System.out.println(myFirstNode.getNext(mySecondNode));
        System.out.println(mySecondNode.getNext(myThirdNode));
    }
}
