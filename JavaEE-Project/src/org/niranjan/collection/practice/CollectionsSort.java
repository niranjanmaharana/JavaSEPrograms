package org.niranjan.collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSort {

	public CollectionsSort() {
	}

	public static void main(String[] args) {
		List list = new ArrayList();
		Comparator comp = Collections.reverseOrder();
		Collections.sort(list, comp);
	}
}