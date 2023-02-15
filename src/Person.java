public class Person {
    private String firstname;
    private String lastname;
    private int birth;

    private String tittel;

    public Person(String firstname, String lastname, int birth, String tittel) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birth = birth;
        this.tittel = tittel;
    }

    @Override
    public String toString(){
        return (tittel + ""+ firstname + " " + " " + "Last name: " + " "+ lastname + " " + " Født:" + birth);

    }


    public String getTittel() {
        return tittel;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }
}
