package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program3 {
	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		Object x = myNums; // erro de compilacao
	
		System.out.println(x);
	}
}
