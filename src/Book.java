public class Book {
    String nameBook;
    private Author author;
    int yearBook;

    public  Book(String nameBook, Author author, int yearBook) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearBook = yearBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.yearBook;
    }

    public void  setYear(int year) {
        this.yearBook = year;
    }


}


