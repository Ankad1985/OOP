package org.example;

public class Student {
    private String firstName;
    private String lastName;
    private String claccId;
    private int journalNumber;

    public Student(String firstName, String lastName, String claccId, int journalNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.claccId = claccId;
        this.journalNumber = journalNumber;
    }

    public Student() {
        super();
    }

    public void setClaccId(String claccId) {
        this.claccId = claccId;
    }

    public void setJournalNumber(int journalNumber) {
        this.journalNumber = journalNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getClaccId() {
        return claccId;
    }

    public int getJournalNumber() {
        return journalNumber;
    }

    @Override
    public String toString() {
        return String.format("firstName: %s, lastName: %s, classId: %s, journalNumber: %d",firstName,lastName,claccId,journalNumber);
    }
}
