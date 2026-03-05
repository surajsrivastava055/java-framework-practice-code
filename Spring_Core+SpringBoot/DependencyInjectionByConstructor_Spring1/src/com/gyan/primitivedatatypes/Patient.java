package com.gyan.primitivedatatypes;

public class Patient {

    private int pId;
    private String pName;
    private int pNumber;

    public Patient(){
        System.out.println("Patient Default constructor Executed...");
    }

    public Patient(int pId) {
        System.out.println("Patient 1 Argument constructor Executed...");
        this.pId = pId;
    }

    public Patient(int pId, String pName) {
        System.out.println("Patient 2 Argument constructor Executed...");
        this.pId = pId;
        this.pName = pName;
    }

    public Patient(int pId, String pName, int pNumber) {
        System.out.println("Patient 3 Argument constructor Executed...");
        this.pId = pId;
        this.pName = pName;
        this.pNumber = pNumber;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpNumber() {
        return pNumber;
    }

    public void setpNumber(int pNumber) {
        this.pNumber = pNumber;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pNumber=" + pNumber +
                '}';
    }
}
