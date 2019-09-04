/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paula
 */
public class Player 
{
    //Create a class Player with the instance variables for the player name and 
    //the amount of goals. A player should have two constructors: 
    //one that initializes the name and an another that initializes the name and 
    //the amount of goals. Implement also the following methods:

//getName, returns the player name
//goals, returns the amount of goals
//toString, returns a string representation that is formed as in the example below
    
    private String name;
    private int goals; 
    
    public Player(String name)
    {
        this(name, 0);
    }
    
    public Player(String name, int goals)
    {
        this.name = name;
        this.goals = goals; 
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int goals()
    {
        return this.goals;
    }
    
    public String toString()
    {
        return String.format("Player: %s, goals %d", this.name, this.goals);
    }
    
}
