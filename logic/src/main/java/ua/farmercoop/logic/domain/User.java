package ua.saniok.web.shop.model.entity;

/**
 * Created by sAnCho on 17.08.2016.
 * @version: 1.1 (03.12.2017)
 */

public class User{

    private int id;
    private String login;
    private String email;
    private String name;
    private String sourname;
    private String dateBirth;
    private String dateReg;
    private int countryId;
    private int postId;		
    private String adress;
    
    public int getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getPassw() {
        return "need implement";
    }

    public String getName() {
        return name;
    }

    public String getSourname() {
        return sourname;
    }

    public int getPostId() {
        return postId;
    }
    public int getCountryId() {
    	return countryId;
    }
    public String getAdress() {
    	return adress;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public String getDateReg() {
        return dateReg;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassw(String passw) {
        //need implement
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSourname(String sourname) {
        this.sourname = sourname;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }
    
}
