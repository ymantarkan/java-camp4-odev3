package Entitiies;

import Interfaces.EntityService;

public class Gamer implements EntityService {

    public int Id;
    public String FirstName;
    public String LastName;
    public int BirthYear;
     public long IdentityNumber;

    public Gamer(int Id, String FirstName, String LastName, int BirthYear, long IdentityNumber) {
        this.Id = Id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.BirthYear = BirthYear;
        this.IdentityNumber = IdentityNumber;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getBirthYear() {
        return BirthYear;
    }

    public void setBirthYear(int BirthYear) {
        this.BirthYear = BirthYear;
    }

    public long getIdentityNumber() {
        return IdentityNumber;
    }

    public void setIdentityNumber(long IdentityNumber) {
        this.IdentityNumber = IdentityNumber;
    }
    
   

}
