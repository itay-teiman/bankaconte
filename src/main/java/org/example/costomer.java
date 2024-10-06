package org.example;

import java.util.Arrays;

public class costomer {

 private string name;
 private string lastName;
 private  string Id;
 private  string address;
 private  string phone;
 private  SavingAccount[] numOfSaving;
 private  banker banker;

 // פעולת set

    public  costomer(){

    }
    public costomer( string name,string lastName,string id,string address,string phone,SavingAccount[] numOfSaving,banker banker){
        this.name=name;
        this.lastName=lastName;
        this.Id=id;
        this.address =address;
        this.phone=phone;
        this.numOfSaving=numOfSaving;
        this.banker=banker;
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

    public SavingAccount[] getNumOfSaving() {
        return numOfSaving;
    }

    public void setNumOfSaving(SavingAccount[] numOfSaving) {
        this.numOfSaving = numOfSaving;
    }

    public org.example.banker getBanker() {
        return banker;
    }

    public void setBanker(org.example.banker banker) {
        this.banker = banker;
    }

    // חישוב מספר החשבונות
   public  int  NumberOfAcoonet(){
        int conter=0;
        for (int i=0;i<this.numOfSaving.length;i++){
            conter++;

        }

       return conter;
   }

    public String toString(){
        return  "name"+" "+this.name+" laste name"+" "+ this.lastName+" id"+" "+this.Id+" "+" adrasee"+" "+ this.address+" "+" phone"+" "+ Arrays.toString(numOfSaving) +" "+banker+" "+NumberOfAcoonet();

    }
}
