package com.example.demo;

import java.util.Random;



public class LifeGame {
	
	private int[][] field;
	private int[][] _field;
	
	
	public LifeGame() {
		field = new int[30][30];
		_field = new int[field.length][field[0].length];
		
		reset();
	}
	
	public void reset() {
        Random rnd = new Random();
		for(int i =0; i < field.length; i++) {
			for(int j =0; j < field[i].length; j++) {
				field[i][j] = rnd.nextInt(2);
				_field[i][j] = field[i][j];
			}
		}
	}

	public void next() {
	
		for(int i = 0; i < field.length; i++) {
			for(int j = 0; j < field[i].length; j++) {
				judge(i, j);
			}
		}	
		
		for(int i = 0 ; i < field.length; i++) {
			for(int j = 0 ; j < field[i].length; j++) {
				field[i][j] = _field[i][j];
			}
		}	

		
	}
	
	private void judge(int i, int j) {
		int count = 0;
		if(field[sideWall(i-1)][j] == 1) count++;
		if(field[sideWall(i+1)][j] == 1) count++;
		if(field[i][verticalWall(j+1)] == 1) count++;
		if(field[i][verticalWall(j-1)] == 1) count++;

		if(field[i][j] == 1) {
			if(count == 2 || count ==3) _field[i][j] = 1;
			else  _field[i][j] = 0;			
		}
		if(field[i][j] == 0) {
			if(count == 3) _field[i][j] = 1;
			else  _field[i][j] = 0;			
		}
	}
	private int sideWall(int i) {
		if(i >= 0)
			return i%(field.length);
		else
			return field.length + i%(field.length);			
	}
	private int verticalWall(int i) {
		if(i >= 0)
			return i%(field[0].length);
		else
			return field[0].length + i%(field[0].length);			
	}
	
	
	public int[][] getField() {
		return field;
	}
	public void setField(int[][] field) {
		this.field = field;
	}

	
	
}
