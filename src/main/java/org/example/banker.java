package org.example;

import java.util.Arrays;

public class banker {

    private string name;
    private string lastName;
    private  string Id;
    private  string address;
    private  string phone;
    private  costomer[] costomer;

    public banker(){

    }

    public banker( string name,string lastName,string id,string address,string phone,costomer[] costomer){
        this.name=name;
        this.lastName=lastName;
        this.Id=id;
        this.address =address;
        this.phone=phone;
        this.costomer=costomer;
    }

    // פעולות get set

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public string getLastName() {
        return lastName;
    }

    public void setLastName(string lastName) {
        this.lastName = lastName;
    }

    public string getId() {
        return Id;
    }

    public void setId(string id) {
        Id = id;
    }

    public string getAddress() {
        return address;
    }

    public void setAddress(string address) {
        this.address = address;
    }

    public string getPhone() {
        return phone;
    }

    public void setPhone(string phone) {
        this.phone = phone;
    }

    public org.example.costomer[] getCostomer() {
        return costomer;
    }

    public void setCustomer(org.example.costomer[] costomer) {
        this.costomer = costomer;
    }
    public  int NumOfcostomer(){
        int conter=0;
        for(int i=0;i<costomer.length;i++){
            conter++;
        }
        return conter;
    }
    public String toString(){
        return  "name"+" "+this.name+" laste name"+" "+ this.lastName+" id"+" "+this.Id+" "+" adrasee"+" "+ this.address+" "+" phone"+" "+"number of costomere  "+NumOfcostomer();

    }
}
