/*
Created by Cody Sandford & Wyatt Brusseau
CustomerInformation class for HotelReservation
This code is done, methods for adding, updating, searching, and deleting will be done in the CustomerManager File
*/
class CustomerInformation{
  String firstName;
  String lastName;
  String phoneNumber;
  String LicenseID;
  boolean isCheckedIn;

  //Constructors
  CustomerInformation (String firstName, String lastName, String phoneNumber, String LicenseID, boolean isCheckedIn){
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.LicenseID = LicenseID;
    this.isCheckedIn = isCheckedIn;
  }
  
  CustomerInformation(){
    this.firstName = "Cody";
    this.lastName = "Sandford";
    this.phoneNumber = "21868687445";
    this.LicenseID = "123456789";
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
  
  void setLicenseID (String LicenseID){
    this.LicenseID = LicenseID;
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
    return this.LicenseID;
  }

  boolean getIsCheckedIn (){
    return this.isCheckedIn;
  }
  String getFullName(){
    return firstName + " " + lastName;
  }
}




