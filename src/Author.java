import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surnameAuthor;


    public  Author (String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;

    }

    public String getnameAuthor() {
        return this.nameAuthor;
    }

    public String getsurnameAuthor() {
        return this.surnameAuthor;
    }

    public String toString() {
        return "Автор - " + nameAuthor + " " + surnameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return nameAuthor.equals(author.nameAuthor) && surnameAuthor.equals(author.surnameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor);
    }

}


