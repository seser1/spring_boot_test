package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalcController {
	
	private LifeGame lifeGame;
	
	public CalcController() {
		lifeGame = new LifeGame();
	}	

    @GetMapping("/lifegameAPI")
    public int[][] test() {
		lifeGame.next();
    	return lifeGame.getField();
    }
    
    /*
	@Scheduled(fixedDelay = 1000)
	public void loop() {
		lifeGame.next();
	}*/

}


