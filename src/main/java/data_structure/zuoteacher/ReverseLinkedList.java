package data_structure.zuoteacher;

/**
 * 单链表反转
 */
class Test{
    public static void main(String[] args) {
        LinkedNode node4 = new LinkedNode("node4", null);
        LinkedNode node3 = new LinkedNode("node3", node4);
        LinkedNode node2 = new LinkedNode("node2", node3);
        LinkedNode node1 = new LinkedNode("node1", node2);
        System.out.println("反转前：");
        ReverseLinkedList.printNode(node1);
        LinkedNode node = ReverseLinkedList.reverse(node1);
        System.out.println("反转后：");
        ReverseLinkedList.printNode(node);
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

            head.setNextNode(pre);
            pre = head;

            head = next;
        }
        return pre;
    }

    public static void printNode(LinkedNode head){
        while(head != null){
            System.out.println("====="+head.getValue());
            head = head.getNextNode();
        }
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
