/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Gavin Armenti
 * @version 2/9/2026
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }
    
    /**
     * Returns the name of the author.
     * Satisfies 2.83.
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Returns the title of the book.
     * Satisfies 2.83.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Returns the number of pages in the book.
     * Satisfies 2.85.
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * Prints the name of the author.
     * Satisfies 2.84.
     */
    public void printAuthor()
    {
        System.out.print(author);
    }
    
    /**
     * Prints the title of the book.
     * Satisfies 2.84.
     */
    public void printTitle()
    {
        System.out.print(title);
    }
    
    /**
     * Prints the number of pages in the book.
     * Satisfies 2.85.
     */
    public void printPages()
    {
        System.out.print(pages);
    }
}
