package xuk.fhffds.dto;

import java.time.LocalDate;

public class EmployeeDto {
 private Long id;
 private String name;
 private String email;
 private Integer age;
 private LocalDate localDate;
 public EmployeeDto(Long employeeId, String name, String mail, Integer age, LocalDate of) {
this.id=employeeId;
this.name=name;
this.email=mail;
this.age=age;
this.localDate=of;
 }


    public void EmployeeDto(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
