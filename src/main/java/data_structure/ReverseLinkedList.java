package data_structure;

class Test{
    public static void main(String[] args) {
        LinkedNode node4 = new LinkedNode("node4", null);
        LinkedNode node3 = new LinkedNode("node3", node4);
        LinkedNode node2 = new LinkedNode("node2", node3);
        LinkedNode node1 = new LinkedNode("node1", node2);
        ReverseLinkedList.reverse(node1);
        System.out.println(node1.getValue());
    }
}

public class ReverseLinkedList {

    // 1-> 2 ->3 ->4
    // 4-> 3 ->2 ->1

    public static LinkedNode reverse(LinkedNode head){
        LinkedNode pre = null;
        LinkedNode next = null;
        while(head != null){
            next = head.getNextNode();
            pre = head;
            head = next;
        }
        return pre;
    }

}



class LinkedNode{
    private String value;
    private LinkedNode nextNode;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LinkedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    public LinkedNode(String value, LinkedNode nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }
}
