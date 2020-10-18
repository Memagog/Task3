package springjpacvsmyscl.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Logins {
    @Id
    @GeneratedValue
    private Long id;
    private String Application;
    private String AppAccountName;
    private String IsActive;
    private String JobTitle;
    private String Department;

    public Logins(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplication() {
        return Application;
    }

    public void setApplication(String application) {
        Application = application;
    }

    public String getAppAccountName() {
        return AppAccountName;
    }

    public void setAppAccountName(String appAccountName) {
        AppAccountName = appAccountName;
    }

    public String getIsActive() {
        return IsActive;
    }

    public void setIsActive(String active) {
        IsActive = active;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "Logins{" +
                "id=" + id +
                ", Application='" + Application + '\'' +
                ", AppAccountName='" + AppAccountName + '\'' +
                ", IsActive=" + IsActive +
                ", JobTitle='" + JobTitle + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }
}
