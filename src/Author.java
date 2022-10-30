import java.util.Objects;

public class Author {
    private String nameWriter;
    private String surnameWriter;


    public  Author (String nameWriter, String surnameWriter) {
        this.nameWriter = nameWriter;
        this.surnameWriter = surnameWriter;

    }

    public String toString() {
        return "Автор - " + nameWriter + " " + surnameWriter;
    }



    public String getnameWriter() {
        return this.nameWriter;
    }

    public String getsurnameWriter() {
        return this.surnameWriter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return nameWriter.equals(author.nameWriter) && surnameWriter.equals(author.surnameWriter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameWriter, surnameWriter);
    }

}


