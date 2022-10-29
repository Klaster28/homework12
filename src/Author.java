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





}


