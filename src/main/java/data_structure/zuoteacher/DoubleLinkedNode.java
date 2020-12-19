package data_structure.zuoteacher;

public class DoubleLinkedNode {
    private String value;
    private DoubleLinkedNode pre;
    private DoubleLinkedNode next;

    public DoubleLinkedNode(String value, DoubleLinkedNode pre, DoubleLinkedNode next) {
        this.value = value;
        this.pre = pre;
        this.next = next;
    }

    public DoubleLinkedNode(String value) {
        this.value = value;
    }

    public DoubleLinkedNode(String value, DoubleLinkedNode pre) {
        this.value = value;
        this.pre = pre;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public DoubleLinkedNode getPre() {
        return pre;
    }

    public void setPre(DoubleLinkedNode pre) {
        this.pre = pre;
    }

    public DoubleLinkedNode getNext() {
        return next;
    }

    public void setNext(DoubleLinkedNode next) {
        this.next = next;
    }

}


class ReverseUtil{
    //  1 <--> 2 <--> 3 <--> 4
    //  4 <--> 3 <--> 2 <--> 1
    public DoubleLinkedNode reverse(DoubleLinkedNode node){
        DoubleLinkedNode pre = null;
        DoubleLinkedNode next = null;
        while(node != null){
            next = node.getNext();

//            pre = node.getPre();
//            node.setPre(next);
//            node.setNext(pre);
//            if(next == null){
//                return node;
//            }

            //方法二
            node.setPre(next);
            node.setNext(pre);
            pre = node;

            node = next;
        }
        return pre;
    }

    public void printNode(DoubleLinkedNode node){
        while(node != null){
            System.out.println(" -- "+node.getValue());
            node = node.getNext();
        }
    }

    
    
    
    
    public static void main(String[] args) {
        ReverseUtil reverseUtil = new ReverseUtil();
        DoubleLinkedNode node1 = new DoubleLinkedNode("node1", null);
        DoubleLinkedNode node2 = new DoubleLinkedNode("node2", node1);
        DoubleLinkedNode node3 = new DoubleLinkedNode("node3", node2);
        DoubleLinkedNode node4 = new DoubleLinkedNode("node4", node3, null);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        System.out.println("反转前：");
        reverseUtil.printNode(node1);
        System.out.println("反转后：");
        DoubleLinkedNode node = reverseUtil.reverse(node1);
        reverseUtil.printNode(node);
    }
}


