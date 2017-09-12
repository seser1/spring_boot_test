package com.example.demo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class APIController {

    @GetMapping("/testAPI")
    public ReturnTest test() {
    	
    	List<String> list = new ArrayList<>();
    	
    	list.add("apple");
    	list.add("orange");
    	
    	ReturnTest retTest = new ReturnTest(100, list);
        return retTest;
    }

}

class ReturnTest{
	private int i;
	private List<String> list;
	
	public ReturnTest(int i, List<String> list) {
		this.i = i;
		this.list = list;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}


	
}