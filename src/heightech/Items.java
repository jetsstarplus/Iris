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
public class Items {
    
    private String itemName;
    private String itemNumber;
    private String itemClass;
    private byte[] itempic;
    private String itemDesc;
    private int itemQuantity;
    private int itemPrice;
    private String adminName;
    private String itemSupplier;
    private String itemModel;

  
    
    //Alt and Ins
    //Generate Constructor and getters and setters

    public Items() {} // Non Parametarised constructor

    
    public Items(String itemModel, String itemName, String itemNumber, String itemClass, byte[] itempic, String itemDesc, int itemQuantity, int itemPrice, String adminName, String itemSupplier) {
       
        this.itemName = itemName;
        this.itemNumber = itemNumber;
        this.itemClass = itemClass;
        this.itempic = itempic;
        this.itemDesc = itemDesc;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
        this.adminName = adminName;
        this.itemSupplier = itemSupplier;
        this.itemModel = itemModel;
    }

    public String getItemModel() {
        return itemModel;
    }

    public void setItemModel(String itemModel) {
        this.itemModel = itemModel;
    }

    /**
     *
     * @return
     */
    
      public String getItemSupplier() {
        return itemSupplier;
    }

    public void setItemSupplier(String itemSupplier) {
        this.itemSupplier = itemSupplier;
    }
    
    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemClass() {
        return itemClass;
    }

    public void setItemClass(String itemClass) {
        this.itemClass = itemClass;
    }

    public byte[] getItempic() {
        return itempic;
    }

    public void setItempic(byte[] itempic) {
        this.itempic = itempic;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
    
    
    
    
}
