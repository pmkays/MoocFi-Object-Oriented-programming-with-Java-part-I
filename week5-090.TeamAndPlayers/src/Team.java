
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paula
 */
public class Team 
{
    private String name;
    private ArrayList<Player> players;
    private int size;
    
    public Team(String name)
    {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.size = 16;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void addPlayer(Player player)
    {
        if(players.size()<this.size)
        {
            players.add(player);
        }
    }
    
//    public int getArraySize()
//    {
//        return players.size(); 
//    }
    
    public void printPlayers()
    {
        for(Player player : players)
        {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize)
    {
        
        this.size = maxSize; 
    }
    
    public int size()
    {
        return players.size();
    }
    
    public int goals()
    {
        int totalGoals = 0;
        for (Player player : players)
        {
            totalGoals += player.goals();
        }     
        return totalGoals; 
    }
    
   
}
