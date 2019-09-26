//package com.cn.learn;
//
//class Node{
//    public Integer data;
//    public Node next;
//    public Node(Integer data, Node next){
//        this.data = data;
//        this.next = next;
//    }
//}
//public class HalfOfLinkedList {
// 
//    public Node halfOfList(Node p){
//        Node fast = p;
//        Node slow = p;
//        /*
//        用异常来做，如果链表为空或者到了链表末尾或者最后剩一步，
//        则抛出异常，直接返回慢的节点。
//        注意：这里注释写的返回值是一个数组，因为中间元素有时是一个，有时是两个，但是实际该方法我们没有考虑这一点
//        try {
//            while ((fast = fast.next.next) != null){
//                slow = slow.next;
//            }
//        }catch (NullPointerException e){
//            return new Node[]{slow,slow.next};
//        }
//        return new Node[]{slow};
// 
//        */
// 
//        //fast.next如果为空说明链表是空表或者已经到了表的末尾
//        while (fast.next != null){
//            //快指针移动两步
//            if(fast.next.next != null){
//                //如果最后剩两步，则移动两步
//                fast = fast.next.next;
//                //慢指针移动一步
//                slow = slow.next;
//            }else{
//                //如果最后只剩一步，则移动一部
//                fast = fast.next;
//            }
//        }
//        return slow;
//    }
// 
//    public static void main(String[] args) {
//        //尾插法，创建链表
//        Node L = new Node(0, null);
//        Node p = L;
//        for (int i = 0; i < 6; i++) {
//             p.next = new Node(i+1,null);
//             p = p.next;
//        }
// 
//        System.out.println(new HalfOfLinkedList().halfOfList(L).data);
//        //System.out.println(new HalfOfLinkedList<integer>().halfOfList(L)[1].data);
//    }
//}
