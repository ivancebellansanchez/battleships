package com.ivan.cebellan.app;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private Board board;
    private List<Ship> ships;
    
    public Player() {
        this.board = new Board();
        ships = new ArrayList();
        ships.add(new Ship(1));
        ships.add(new Ship(2));
        ships.add(new Ship(3));
        ships.add(new Ship(4));
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public List<Ship> getShips(){
        return this.ships;
    }

    public Board getBoard() {
        return this.board;
    }
    
}
