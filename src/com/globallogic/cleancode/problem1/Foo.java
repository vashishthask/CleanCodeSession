package com.globallogic.cleancode.problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Foo {
	private List<String> bars = new ArrayList<String>();
	
	public List<String> getBars(){
		return Collections.unmodifiableList(bars);
	}
}