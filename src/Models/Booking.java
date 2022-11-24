package Models;

public class Booking {
    int bookid;
    int studentid;
    int extradays;
    int fine;

    String Format;
    private String format;

    public Booking(int bookid, int studentid, int extradays) {
        this.bookid = bookid;
        this.studentid = studentid;
        this.extradays = extradays;

    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getExtradays() {
        return extradays;
    }

    public void setExtradays(int extradays) {
        this.extradays = extradays;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = this.extradays*5;
    }

    public void setFormat(String format) {

        Format = format;
    }

    public static String getFormat() {
        System.out.println("Book id " + "student id " + "Extra days "+ "Fine" );
        System.out.println(this.getBookid()+"        "+ this.getStudentid()+"  "+this.getExtradays()+""+this.getFine());
        return format;
    }

}
