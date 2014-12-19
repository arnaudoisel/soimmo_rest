package fr.soat.soimmo.rest.utils;

import java.util.ArrayList;
import java.util.List;

public class Utils{

	public static <E> List<E> toList(Iterable<E> iterable) {
		if(iterable instanceof List) {
			return (List<E>) iterable;
		}
		ArrayList<E> list = new ArrayList<E>();
		if(iterable != null) {
			for(E e: iterable) {
				list.add(e);
			}
		}
		return list;
	}

	public static boolean isEmpty(String str) {
		if (str == null || str.isEmpty())
			return true;
		return false;
	}
}