package models;
import functions.*;

/**
 * Created by Дмитрий on 07.08.2017.
 */
public class AvRequest {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    private String telephone;
    private String email;
    private String organization;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public AvRequest(){}

    public AvRequest(String name, String telephone){
        this.name = name + FunctionBase.generateRandomNumber(7);
        this.telephone = telephone;
    }

    public AvRequest(String name, String email, String message){
        this.name = name + FunctionBase.generateRandomNumber(7);;
        this.email = email;
        this.message = message;
    }

    public AvRequest(String organization, String name, String telephone, String email){
        this.name = name + FunctionBase.generateRandomNumber(7);
        this.telephone = telephone;
        this.email = email;
        this.organization = organization;
    }



}
