package com.spring_boot.plataforma_de_fornecedores.model.user;

import jakarta.persistence.Embeddable;

@Embeddable
public class Contact {
    private String email;
    private String phoneNumber;
    private String website;

    public Contact(String email, String phoneNumber, String website) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.website = website;
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

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
