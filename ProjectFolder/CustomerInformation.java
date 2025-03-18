/*
Created by Cody Sandford & Wyatt Brusseau
CustomerInformation class for HotelReservation
This code is done, methods for adding, updating, searching, and deleting will be done in the CustomerManager File
*/
class CustomerInformation{
  String firstName;
  String lastName;
  String phoneNumber;
  String licenseID;
  boolean isCheckedIn;

  //Constructors
  CustomerInformation (String firstName, String lastName, String phoneNumber, String licenseID, boolean isCheckedIn){
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.licenseID = licenseID;
    this.isCheckedIn = isCheckedIn;
  }
  
  CustomerInformation(){
    this.firstName = "Cody";
    this.lastName = "Sandford";
    this.phoneNumber = "21868687445";
    this.licenseID = "123456789";
    this.isCheckedIn = false;
  }
  
  //Getters and Setters
  void setFirstName (String firstName){
    this.firstName = firstName;
  }
  
  void setLastName (String lastName){
    this.lastName = lastName;
  }
  
  void setPhoneNumber (String phoneNumber){
    this.phoneNumber = phoneNumber;
  }
  
  void setLicenseID (String licenseID){
    this.licenseID = licenseID;
  }
  
  void setIsCheckedIn (boolean isCheckedIn){
    this.isCheckedIn = isCheckedIn;
  }
  
  String getFirstName (){
    return this.firstName;
  }

  String getLastName (){
    return this.lastName;
  }

  String getPhoneNumber (){
    return this.phoneNumber;
  }

  String getLicenseID (){
    return this.licenseID;
  }

  boolean getIsCheckedIn (){
    return this.isCheckedIn;
  }
  String getFullName(){
    return firstName + " " + lastName;
  }
  public String toString(){
    return "Customer Name: " + firstName + " " + lastName + "\nPhone Number: " + phoneNumber + "\nLicense Number: " + licenseID + "\nChecked In: " + (isCheckedIn ? "Yes" : "No");
  }
}


