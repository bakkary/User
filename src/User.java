import java.util.Objects;

public class User {
public String foreNavn;
public String efterNavn;
public String mail;
public int tlf;



    public User (String foreNavn, String efterNavn, String mail){
        this.foreNavn = foreNavn;
        this.efterNavn = efterNavn;
        this.mail = mail;
    
    }




    public String getForeNavn() {
        return foreNavn;
    }

    public void setForeNavn(String foreNavn) {
        this.foreNavn = foreNavn;
    }

    public String getEfterNavn() {
        return efterNavn;
    }

    public void setEfterNavn(String efterNavn) {
        this.efterNavn = efterNavn;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    @Override
    public String toString() {
        return "User{" +
                "foreNavn='" + foreNavn + '\'' +
                ", efterNavn='" + efterNavn + '\'' +
                ", mail='" + mail + '\'' +
                ", tlf=" + tlf +
                '}';
    }
}
