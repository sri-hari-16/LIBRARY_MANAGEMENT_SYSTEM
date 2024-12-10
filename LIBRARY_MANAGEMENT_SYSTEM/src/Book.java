class Book
{//start of book class
    private  String title;
    private  String author;
    private  String isbn;
    private  boolean isIssued;

    //default constructor
    public Book()
    {//start of public constructor
        this.title=" ";
        this.author=" ";
        this.isbn=" ";
        this.isIssued=false;
    }//end of public constructor

    //parametrized constructor
    public Book(String title,String author,String isbn)
    {//start of parametrized constructor
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.isIssued=false;
    }//end of parametrized constructor

    //next i have to set the getters and setters for the variables 

    //setter for the title variable
    public void setTitle(String title)
    {
        this.title=title;
    }

    //getter for the title variable
    public String getTitle()
    {
        return title;
    }

    //getter for the author variable
    public void setAuthor(String author)
    {
        this.author=author;
    }

    //setter for the author variable
    public String getAuthor()
    {
        return author;
    }


    //getter for the isbn variable
    public void setIsbn(String isbn)
    {
        this.isbn=isbn;
    }

    //setter for the isbn variable
    public String getIsbn()
    {
        return isbn;
    }

    //getter for the isIssued variable
    public void setIssued(boolean issued)
    {
        this.isIssued=issued;
    }

    //setter for the isIssued variable
    public boolean isIssued()
    {
        return isIssued;
    }

    //overriding two string method to print the details
    @Override
    public String toString()
    {
        return "Book Title:"+title+" "+"\nAuthor:"+author+" "+"\nISBN NUMBER:"+isbn+" "+"\nISSUE DETAILS:"+isIssued+" ";
    }
    }//end of book class 

//TESTING PART [GOOD TO GO].

    /**
     * public static void main(String[] args) 
    {
        System.out.println("for default checking");
        Book book1 = new Book();

        System.out.println(book1+"\n");
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getIsbn());
        System.out.println(book1.isIssued());
        System.out.println("\n");
        System.out.println("for parametre constructor testing");
        Book book = new Book("SHRD","RD","2816");

            System.out.println(book);
            System.out.println(book.getTitle());
            System.out.println(book.getAuthor());
            System.out.println(book.getIsbn());
            System.out.println(book.isIssued());

            book.setTitle("SRI HARI REENA DEVI");

            System.out.println(book);
    }
     */
