package org.example;

public class Department {
    private int idDepartment;
    private String nameDepartment;

    // Constructor không có parameters
    public Department() {
        this.idDepartment = 0;
        this.nameDepartment = "Unknown";
    }
    public int getIdDepartment() {
        return idDepartment;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }


    // Constructor có 1 parameter là nameDepartment
    public Department(String nameDepartment) {
        this.idDepartment = 0;
        this.nameDepartment = nameDepartment;
    }
    public void displayIn4(){
        System.out.println("_______Department information______");
        System.out.println("ID: " + this.idDepartment);
        System.out.println("Name: " + this.nameDepartment);
    }
}
