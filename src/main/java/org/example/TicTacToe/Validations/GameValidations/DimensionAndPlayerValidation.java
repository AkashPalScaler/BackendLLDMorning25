package org.example.TicTacToe.Validations.GameValidations;

import org.example.TicTacToe.Models.Game;
import org.example.TicTacToe.Models.Player;

import java.util.List;

public class DimensionAndPlayerValidation {
    public static void validate(int dimension, List<Player> players){
        if(players.size() <= 1 || dimension <= players.size()){
            throw new RuntimeException("Players size and Dimension are not valid");
        }
    }
}
