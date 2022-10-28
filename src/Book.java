public class Book {
    String nameBook;
    String nameAuthor;
    int yearBook;

    public  Book(String nameBook, String nameAuthor, int yearBook) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.yearBook = yearBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }
    public int getYear() {
        return this.yearBook;
    }

    public void  setYear(int year) {
        this.yearBook = year;
    }


}


