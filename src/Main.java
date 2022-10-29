
public class Main {

        public static void main(String[] args) {
            Author author = new Author("Ivan", "Ivanov");
            Book book = new Book ("Masters", author , 1983);
            System.out.println("Название - " + book.getNameBook () + ", " + book.getAuthor () + ", Год публикации - " + book.getYear ());
            book.setYear(1986);
            System.out.println("Год публикации - " + book.getYear());

            Author author2 = new Author("Fedor", "Fedorov");
            Book book2 = new Book ("Demon", author2, 1991);
            System.out.println("Название - " + book2.getNameBook () +", "+ book2.getAuthor () + ", Год публикации - " + book2.getYear ());


        }
    }

