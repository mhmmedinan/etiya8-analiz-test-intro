package OOP.inheritance;

public class Student extends User {
    private String about;


    public Student(){

    }

    public Student(String about) {
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
