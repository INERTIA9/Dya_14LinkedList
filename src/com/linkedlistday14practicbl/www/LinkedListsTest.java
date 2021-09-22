package com.linkedlistday14practicbl.www;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.linkedlistday14practicbl.www.LinkedLists.Node;

public class LinkedListsTest {

	@Test
	public void search() {
		LinkedLists linkedlist = new LinkedLists();
		linkedlist.addAtStart(33);
		linkedlist.addAtStart(70);
		linkedlist.addAtStart(50);
		Assertions.assertTrue(linkedlist.search(70));

	}
}
	