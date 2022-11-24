import Models.Books;
import Models.Booking;

import Models.Students;


public class Main {
    public static void main(String[] args) {
        Books book1= new Books("SOMETHING","Asim",11,15);
        Students  std1 = new Students("Asim",12,20 );
        Booking bking1 = new Booking(10001,001,2);
        System.out.println(Books.getFormat());
        System.out.println(Students.getFormat());
        System.out.println(Booking.getFormat());

    }
}