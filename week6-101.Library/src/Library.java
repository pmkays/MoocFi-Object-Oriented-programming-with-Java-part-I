
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
public class Library 
{
    private ArrayList<Book> books;

    public Library()
    {
         books = new ArrayList<Book>();
    }

    public void addBook(Book newBook)
    {
        books.add(newBook);
    }

    public void printBooks()
    {
        for (Book book : books)
        {
            System.out.println(book);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title)
    {
        ArrayList<Book> titleMatch = new ArrayList<Book>(); 
        for (Book book : books)
        {
            if(StringUtils.included(book.title(), title))
            {
                titleMatch.add(book);
            }
        }
        return titleMatch; 
    }
    public ArrayList<Book> searchByPublisher(String publisher)
    {
        ArrayList<Book> publisherMatch = new ArrayList<Book>(); 
        for (Book book : books)
        {
            if(StringUtils.included(book.publisher(), publisher))
            {
                publisherMatch.add(book);
            }
        }
        return publisherMatch; 
        
    }
    public ArrayList<Book> searchByYear(int year)
    {
        ArrayList<Book> yearMatch = new ArrayList<Book>(); 
        for (Book book : books)
        {
            if(book.year() == year)
            {
                yearMatch.add(book);
            }
        }
        return yearMatch; 
    }
    
}
