package com.cn.learn;

/**
 * 自己实现类似于JDK的LinkedList类
 * 
 * @author Administrator
 *
 * @param <E>
 */
public class LspLinkedList<E> {
 
	private Node<E> first;
	private Node<E> last;
	private int size;
	
	public int size(){
		return size;
	}
	
	/**
	 * 添加一个节点
	 * @param e
	 */
	public void add(E e){
		
		Node<E> node = new Node<E>();
		if(first == null){
			node.previous = null;
			node.item = e;
			node.next = null;
			first = node;
			last = node;//首尾节点为同一个
		}else {
			//直接向last中插入下一节点
			node.previous = last;
			node.item = e;
			node.next = null;
			//给last的下一节点赋值为当前传入的节点值
			last.next = node;
			
			//重新给last节点赋值
			last = node;
		}
		size++;
	}
	
	/**
	 * 根据index获取节点
	 * @param index
	 * @return
	 */
	public E get(int index){
		if(first != null){
			Node<E> temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp.item;
		}
		return null;
	}
	
	/**
	 * 根据index删除节点元素
	 * @param index
	 */
	public void remove(int index){
		if(first != null){
			Node<E> temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			
			Node<E> before = temp.previous;
			Node<E> after = temp.next;
			before.next = after;
			after.previous = before;
			
			size--;
		}
	}
	
	/**
	 * 获取链表的中间节点（在未知链表长度的情况下）
	 * @return
	 */
	public E getMidNode(){
		if(first != null){
			Node<E> temp = first;
			Node<E> temp2 = temp.next;
			while(temp.next != null && temp2.next != null){
				temp = temp.next;
				temp2 = temp2.next;
				if(temp2.next != null){
					temp2 = temp2.next;
				}
			}
			return temp.item;
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		LspLinkedList<String> lspLinkedList = new LspLinkedList<String>();
		lspLinkedList.add("111");
		lspLinkedList.add("222");
		lspLinkedList.add("333");
		lspLinkedList.add("444");
		lspLinkedList.add("555");
		System.out.println(lspLinkedList.getMidNode());
	}
	
}






class Node<E> {
	 
	Node<E> previous;
	E item;
	Node<E> next;
 
	public Node() {
	}
 
	public Node(E item, Node<E> previous, Node<E> next) {
		super();
		this.item = item;
		this.previous = previous;
		this.next = next;
	}
 
}





