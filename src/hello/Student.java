/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello;

/**
 *
 * @author chris
 */
public class Student {
    
    private String sID;
    private String sName;
    private String sAddress;

    public Student(String sID, String sName) {
        this.sID = sID;
        this.sName = sName;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getAddress() {
        return sAddress;
    }

    public void setAddress(String sAddress) {
        this.sAddress = sAddress;
    }
    
    
    
}
