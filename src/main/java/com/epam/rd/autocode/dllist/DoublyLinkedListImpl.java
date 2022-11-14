package com.epam.rd.autocode.dllist;

import java.util.Optional;

public class DoublyLinkedListImpl implements DoublyLinkedList {

	private Node head;
	
	private Node tail;

	private static class Node {

		Object element;

		Node next;

		Node prev;

		Node(Object obj, Node prev, Node next) {
			this.element = obj;
			this.next = next;
			this.prev = prev;
		}

	}
	
	@Override
	public boolean addFirst(Object element) {
		return false;
	}

	@Override
	public boolean addLast(Object element) {
		return false;
	}

	@Override
	public void delete(int index) {
		
	}
	
	@Override
	public Optional<Object> remove(Object element) {
		return null;
	}

	@Override
	public boolean set(int index, Object element) throws IndexOutOfBoundsException {
		return false;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public String toString() {
		return null;
	}
	
}
