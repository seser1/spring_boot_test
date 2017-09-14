package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalcController {
	
	private LifeGame lifeGame;
	
	public CalcController() {
		lifeGame = new LifeGame();
	}	

    @GetMapping("/lifegame/API/field")
    public int[][] lifegameAPI() {
		lifeGame.next();
    	return lifeGame.getField();
    }
    
    @GetMapping("/lifegame/API/reset")
    public void reset() {
		lifeGame.reset();
    }
    


}


