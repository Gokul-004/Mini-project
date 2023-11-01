package com.travel1.travel1;

public class Registrationdetails {
   
    private String name;
    private int phonenumber;
    private String emailid;
    private int age;
    private String rollno;
    private String address;
    private String dateofbirth;
public void setRollno(String rollno){
    this.rollno=rollno;
}
public String getRollno(){
    return rollno;
}
public void setAddress(String address){
    this.address=address;
}
public String getAddress(){
    return address;
}
public void setdateofbirth(String dateofbirth){
    this.dateofbirth=dateofbirth;
}
public String getdateofbirth(){
    return dateofbirth;
}

public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
 
}

