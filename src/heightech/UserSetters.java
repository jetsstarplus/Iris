/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heightech;

/**
 *
 * @author User
 */
public class UserSetters {
    private String fName;
    private String lName;
    private String email;
    private String phone;
    private int idNo;
    private String userName;
    private String pass;
    

    public UserSetters() {
    }

    public UserSetters(String fName, String lName, String email, int idNo, String phone, String userName, String pass) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phone = phone;
        this.idNo = idNo;
        this.userName = userName;
        this.pass = pass;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
