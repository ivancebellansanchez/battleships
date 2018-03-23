package com.ivan.cebellan.app;

public class Board {
    private boolean[][] map = null;
    
    public Board(){
        this.map = new boolean[9][9];
    }
    
    public boolean getCoords(int x, int y){
        return this.map[x][y];
    }
    
    public void setCoordsValue(int x, int y, boolean value){
        this.map[x][y] = value;
    }

    public boolean[][] getMap() {
        return this.map;
    }
    
}
