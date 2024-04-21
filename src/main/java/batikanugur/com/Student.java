package batikanugur.com;
//POJO Model
public class Student {
    private String idNumber;
    private String firstname;
    private String lastName;

    public Student() {
    }

    public Student(String firstname) {
        this.firstname = firstname;
    }

    public Student(String idNumber, String firstname, String lastName) {
        this.idNumber = idNumber;
        this.firstname = firstname;
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
