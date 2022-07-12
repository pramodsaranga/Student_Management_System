package model;

public class Student {

    private String StudentID;
    private String StudentName;
    private String Email;
    private String Contact;
    private String Address;
    private String NIC;

    public Student() {
    }

    public Student(String studentID, String studentName, String email, String contact, String address, String NIC) {
        this.setStudentID(studentID);
        this.setStudentName(studentName);
        this.setEmail(email);
        this.setContact(contact);
        this.setAddress(address);
        this.setNIC(NIC);
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID='" + StudentID + '\'' +
                ", StudentName='" + StudentName + '\'' +
                ", Email='" + Email + '\'' +
                ", Contact='" + Contact + '\'' +
                ", Address='" + Address + '\'' +
                ", NIC='" + NIC + '\'' +
                '}';
    }
}
