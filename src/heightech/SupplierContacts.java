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
    
public class SupplierContacts {
    
    private String name;
    private String email;
    private String mobile;
    private String items;
    private String address;
    
    public SupplierContacts()
    {
        
    }

    public SupplierContacts(String name, String email, String mobile, String items, String address) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.items = items;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
