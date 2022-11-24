package Models;

public class Students {
String name;
int class1;

int noofbooks;
String format;

    public Students(String name, int class1, int noofbooks) {

        this.name = name;
        this.class1 = class1;
        this.noofbooks = noofbooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClass1() {
        return class1;
    }

    public void setClass1(int class1) {
        this.class1 = class1;
    }

    public int getNoofbooks() {
        return noofbooks;
    }

    public void setNoofbooks(int noofbooks) {
        this.noofbooks = noofbooks;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public static String getFormat() {
        System.out.println("The student is "+this.name + " of class "+this.class1 + "borrowed "+this.noofbooks +" books");

        return format;
    }


}
