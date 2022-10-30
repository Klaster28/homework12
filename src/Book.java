import java.util.Objects;

public class Book {
    String nameBook;
    private Author author;
    int yearBook;

    public  Book(String nameBook, Author author, int yearBook) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearBook = yearBook;
    }


    public String toString() {
        return  "Название книги - " + nameBook + ", " + author + ", год публикации" + yearBook ;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearBook);
    }
}


