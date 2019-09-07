
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paula
 */
public class Menu 
{
    ArrayList<Bird> birds = new ArrayList<Bird>();
    int observed = 0; 
    
    public void menu()
    {
        Scanner reader = new Scanner(System.in);
        
//        System.out.println("?");
//        String input = reader.nextLine().toLowerCase(); 
        
        while(true) 
        {
            System.out.println("?");
            String input = reader.nextLine().toLowerCase(); 
        
            if(input.equals("quit"))
            {
                break;
            }
            else if(input.equals("add"))
            {
                System.out.println("Name: ");
                String name = reader.nextLine();
                
                System.out.println("Latin name: ");
                String latinName = reader.nextLine();
                
                add(name, latinName); 
            }
            else if(input.equals("observation"))
            {
                System.out.println("What was observed:? ");
                String name = reader.nextLine(); 
                
                observation(name); 
            }
            else if(input.equals("statistics"))
            {
                statistics(); 
            }
            else if(input.equals("show"))
            {
                System.out.println("What? ");
                String name = reader.nextLine(); 
                
                show(name); 
            }
        }
    }
    
    public void add(String name, String latinName)
    {
        Bird newBird = new Bird(name, latinName);
        birds.add(newBird);
    }
    
    public void observation(String name)
    {
        for(Bird bird : birds)
        {
            if(bird.getName().equals(name))
            {
               bird.setObserved(bird.getObserved() + 1);
            }
            else
            {
                System.out.println("Is not a bird!");
            }
        }    
    }
    
    public void statistics()
    {
        for(Bird bird : birds)
        {
            System.out.println(bird);
        }
    }
    
    public void show(String name)
    {
        for(Bird bird : birds)
        {
            if(bird.getName().equals(name))
            {
                System.out.println(bird);;
            }
            else
            {
                System.out.println("Bird not found!");
            }
        }
    }
}
