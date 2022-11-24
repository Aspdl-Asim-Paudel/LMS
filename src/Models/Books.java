package Models;

public class Books {
String name;
String author;
int ispn;
int published_year;

String format;

    public Books(String name, String author, int ispn, int published_year) {
        this.name = name;
        this.author = author;
        this.ispn = ispn;
        this.published_year = published_year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIspn() {
        return ispn;
    }

    public void setIspn(int ispn) {
        this.ispn = ispn;
    }

    public int getPublished_year() {
        return published_year;
    }

    public void setPublished_year(int published_year) {
        this.published_year = published_year;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String void getFormat() {
        System.out.println("name "+this.name + "\nAuthor: "+this.author + "\nISPN: "+this.ispn+"\nPublished year: "+this.published_year );
    }

}
