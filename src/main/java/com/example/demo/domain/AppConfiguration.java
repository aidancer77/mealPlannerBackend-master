package com.example.demo.domain;

public class AppConfiguration {
    String databasePG = System.getenv("PG_DATABASE");
    String localhostPG = System.getenv("PG_HOST");
    String portPG = System.getenv("PG_PORT");
    String userPG = System.getenv("PG_USER");
    String passwordPG = System.getenv("PG_PASSWORD");

    public String getDatabasePG() { return databasePG; }
    public void setDatabasePG(String databasePG) { this.databasePG = databasePG; }

    public String getLocalhostPG() { return localhostPG; }
    public void setLocalhostPG(String localhostPG) { this.localhostPG = localhostPG; }

    public String getPortPG() { return portPG; }
    public void setPortPG(String portPG) { this.portPG = portPG; }

    public String getUserPG() { return userPG; }
    public void setUserPG(String userPG) { this.userPG = userPG; }

    public String getPasswordPG() { return passwordPG; }
    public void setPasswordPG(String passwordPG) { this.passwordPG = passwordPG; }
}
