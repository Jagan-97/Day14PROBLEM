public class MyNode<K> implements INode<K> {
    private K key;
    private INode next;

    @Override
    public String toString() {
        return "MyNode{" +
                "key=" + key +
                ", next=" + next +
                '}';
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode getNext() {
        return next;
    }


    @Override
    public void setNext(INode next) {
       this.next = next;
    }

    public INode getNext(MyNode<Integer> mySecondNode) {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode(K key){
        this.key = key;
        this.next = null;
    }
}
