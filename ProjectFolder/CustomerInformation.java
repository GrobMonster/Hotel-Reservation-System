/*
Created by Cody Sandford & Wyatt Brusseau
CustomerInformation class for HotelReservation
*/
class customerInformation{
  String firstName;
  String lastName;
  String phoneNumber;
  String LicenseID;
  boolean isCheckedIn;

  //Constructors
  customerInformation (String firstName, String lastName, String phoneNumber, String LicenseID, boolean isCheckedIn){
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.LicenseID = LicenseID;
    this.isCheckedIn = isCheckedIn;
  }
  
  customerInformation(){
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
  
  String getFirstName (customerInformation customer){
    return this.firstName;
  }

  String getLastName (customerInformation customer){
    return this.lastName;
  }

  String getPhoneNumber (customerInformation customer){
    return this.phoneNumber;
  }

  String getLicenseID (customerInformation customer){
    return this.LicenseID;
  }

  boolean getIsCheckedIn (customerInformation customer){
    return this.isCheckedIn;
  }

}




