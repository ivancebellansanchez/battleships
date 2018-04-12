package com.ivan.cebellan.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nombre jugador 1: ");
            String namePlayer1 = br.readLine();
            System.out.println("Nombre jugador 2: ");
            String namePlayer2 = br.readLine();
            Player player1 = new Player();
            player1.setName(namePlayer1);
            Player player2 = new Player();
            player2.setName(namePlayer2);
            
            System.out.println("Los jugadores de la partida son: " + player1.getName() + " y " + player2.getName());
            player1 = chooseShipsForPlayer(br, player1);
            player2 = chooseShipsForPlayer(br, player2);
            
            printPlayerMap(player1);
            System.out.println("  ");
            printPlayerMap(player2);
            
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static Player chooseShipsForPlayer(BufferedReader br, Player player)throws IOException{
        System.out.println("Jugador " + player.getName() + " elija las coordenadas de sus barcos");
        List<Ship> player1Ships = player.getShips();
        for (Ship ship: player1Ships) {
            System.out.println("Elija las coordenadas (ejemplo: X,Y) de inicio del barco de tamaño " + ship.getSize());
            String coords = br.readLine();
            String[] coordsArray = coords.split(",");
            int xStartCoord = Integer.parseInt(coordsArray[0]);
            int yStartCoord = Integer.parseInt(coordsArray[1]);
            player.getBoard().setCoordsValue(xStartCoord, yStartCoord, true);
            
            if (ship.getSize() > 1){
                System.out.println("Elija las coordenadas (ejemplo: X,Y) de fin del barco de tamaño " + ship.getSize());
                coords = br.readLine();
                coordsArray = coords.split(",");
                int xEndCoord = Integer.parseInt(coordsArray[0]);
                int yEndCoord = Integer.parseInt(coordsArray[1]);

                if (ship.getSize() == 2) {
                    if (xEndCoord < xStartCoord) {
                        
                    } else if (xEndCoord == xStartCoord) {
                        
                    } else if (xEndCoord > xStartCoord) {
                        
                    }
                } else if (ship.getSize() == 3) {
                    
                } else if (ship.getSize() == 4) {
                    
                }
                player.getBoard().setCoordsValue(xEndCoord, yEndCoord, true);
            }
        }
        return player;
    }
    private static void fillShipLines(int firstPositionX, int firstPositionY, int secondPositionX, int secondPositionY){
        
    }
    private static void printPlayerMap(Player player){
        Board board = player.getBoard();
        for(boolean[] arrY: board.getMap()){
            for(boolean value: arrY){
                if (value){
                    System.out.print("O");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
    }
}
