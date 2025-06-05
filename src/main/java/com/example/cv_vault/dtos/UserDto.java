package com.example.cv_vault.dtos;

public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String JobTitle;
    private String email;
    private String phoneNumber;
    private String address;
    private String nationality;
    private String drivingLicense;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getJobTitle() {
        return JobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.JobTitle = jobTitle;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getDrivingLicense() {
        return drivingLicense;
    }
    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", nationality='" + nationality + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                '}';
    }
}
