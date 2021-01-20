package com.company.collection;

/**
 * @author zsw
 * @date 2020/12/31 14:46
 * 单向链表
 */
public class SingletonLinked {
    /**
     * 单向链表是最简单的链表，单链表节点包含两部分内容，一是保存某些数据信息的对象，另一个是存储下一个节点的地址，最后一个节点存储的地址是指向空值；
     * <p>
     * 单向链表只可向一个方向遍历，一般查找一个节点的时候需要从第一个节点开始每次访问下一个节点，一直访问到需要的位置。而插入一个节点，
     * 对于单向链表，我们只提供在链表头插入，只需要将当前插入的节点设置为头节点，next指向原头节点即可。删除一个节点，我们将该节点的上一个节点的next指向该节点的下一个节点。
     */
    private int size;
    private Node head;

    public SingletonLinked(int size) {
        this.size = size;
    }

    /**
     * 链表每个节点
     */
    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    /**
     * 在链表头添加元素
     */
    public void addHead(Object data) {
        Node newHead = new Node(data);
        if (size == 0) {
            head = newHead;
        } else {
            head = newHead;
            newHead.next = head;
        }
        size++;
    }

    /**
     * 删除链表头的元素
     */
    public Object deleteHead() {
        if (size > 0) {
            head = head.next;
            Object data = head.data;
            size--;
            return data;
        }
        return null;
    }

    /**
     * 查找指定元素，找到返回节点Node
     */
    public Node find(Object object) {
        Node current = head;
        int template = size;
        while (template > 0) {
            if (current.data.equals(object)) {
                return current;
            } else {
                current = current.next;
            }
            template--;
        }
        return null;
    }

    /**
     * 删除指定元素
     */
    public boolean delete(Object value) {
        if (size == 0) {
            return false;
        }
        Node current = head;
        Node pre = head;
        while (current.data != value) {
            if (current.next == null) {
                return false;
            }else{
                pre = current;
                current = current.next;
            }
        }

        if(current == head){ //如果删除的是第一个元素
            head = current.next;
            size--;
        }else {
            pre.next = current.next;  // 删除的不是第一个元素，把pre(当前元素)的下一个元素 = current 的下一元素
            size--;
        }
        return true;
    }

    //判断是否为空
    public boolean isEmpty(){
        return (size==0);
    }

    //遍历链表
    public void display(){
        if(size>0){
            Node node = head;
            int tempSize = size;
            if(tempSize ==1){
                System.out.print( "["+node.data+"]");
            }
            while(tempSize>0){
                if(node.equals(head)){
                    System.out.print("["+node.data+"->");
                }else if(node.next == null){
                    System.out.print(node.data+"]");
                }else{
                    System.out.print(node.data+"->");
                }
                node = node.next;
                tempSize--;
            }
            System.out.println();
        }else{
            System.out.println("[]");
        }
    }
}
