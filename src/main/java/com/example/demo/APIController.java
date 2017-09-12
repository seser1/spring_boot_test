package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class APIController {

    @GetMapping("/testAPI")
    public ReturnTest test() {

    	ReturnTest retTest = new ReturnTest(100);
        return retTest;
    }

}

class ReturnTest{
	private int i;
	
	public ReturnTest(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}