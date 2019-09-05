
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
public class Phonebook 
{
    private ArrayList<Person> people = new ArrayList<Person>();
    
    public void add(String name, String number)
    {
        Person newPerson = new Person(name, number);
        people.add(newPerson);          
    }
    
    public void printAll()
    {
        for(Person person : people)
        {
            System.out.println(person);
        }
    }
    
    public String searchNumber(String name)
    {
        for(Person person : people)
        {
            if (person.getName().equals(name))
            {
                return person.getNumber();        
            }
        }
        return "number not known";
    }
    
}
