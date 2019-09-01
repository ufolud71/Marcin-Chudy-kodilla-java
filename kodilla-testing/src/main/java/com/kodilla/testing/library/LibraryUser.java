package com.kodilla.testing.library;

public class LibraryUser {
    String firstname;
    String lastname;
    String peselID;

    public LibraryUser(String firstname, String lastname, String peselID) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselID = peselID;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPeselID() {
        return peselID;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", peselID='" + peselID + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser)) return false;

        LibraryUser that = (LibraryUser) o;

        if (!getFirstname().equals(that.getFirstname())) return false;
        if (!getLastname().equals(that.getLastname())) return false;
        return getPeselID().equals(that.getPeselID());
    }

    @Override
    public int hashCode() {
        int result = getFirstname().hashCode();
        result = 31 * result + getLastname().hashCode();
        result = 31 * result + getPeselID().hashCode();
        return result;
    }
}
