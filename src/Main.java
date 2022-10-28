
public class Main {

        public static void main(String[] args) {
            Book book = new Book ("Masters", "Petrov", 1983);
            System.out.println("Название - " + book.getNameBook ());
            System.out.println("Фамилия автора - " + book.getNameAuthor ());
            System.out.println("Год публикации - " + book.getYear ());
            System.out.println(book.getYear ());
            book.setYear(1986);
            System.out.println("Год публикации - " + book.getYear());

            Book book2 = new Book ("Demon", "Sidorov", 1991);
            System.out.println("Название - " + book2.getNameBook ());
            System.out.println("Фамилия автора - " + book2.getNameAuthor ());
            System.out.println("Год публикации - " + book2.getYear ());

            Author author = new Author("Ivan", "Ivanov");
            System.out.println("Имя писателя - " + author.getnameWriter ());
            System.out.println("Фамилия писателя - " + author.getsurnameWriter ());

            Author author2 = new Author("Fedor", "Fedorov");
            System.out.println("Имя писателя - " + author2.getnameWriter ());
            System.out.println("Фамилия писателя - " + author2.getsurnameWriter ());
        }
    }

