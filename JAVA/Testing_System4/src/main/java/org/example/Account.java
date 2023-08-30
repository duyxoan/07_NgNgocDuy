package org.example;

import java.time.LocalDateTime;

public class Account {
    private int id;
    private String email;
    private String username;
    private String firstName;
    private String lastName;
    private String fullName;
    private String position;
    private LocalDateTime createDate;

    // Constructor không có parameters
    public Account() {
        this.createDate = LocalDateTime.now();
    }

    // Constructor có các parameters id, Email, Username, FirstName, LastName
    public Account(int id, String email, String username, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.createDate = LocalDateTime.now();
    }

    // Constructor có các parameters id, Email, Username, FirstName, LastName, Position và default createDate = now
    public Account(int id, String email, String username, String firstName, String lastName, String position) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = LocalDateTime.now();
    }

    // Constructor có các parameters id, Email, Username, FirstName, LastName, Position và createDate
    public Account(int id, String email, String username, String firstName, String lastName, String position, LocalDateTime createDate) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = createDate;
    }

    public  void display() {
        // Khởi tạo object với constructor không có parameters
        Account account1 = new Account();
        System.out.println(account1.createDate);

        // Khởi tạo object với constructor có các parameters id, Email, Username, FirstName, LastName
        Account account2 = new Account(1, "example@email.com", "user123", "Duy", "Nguyễn");
        System.out.println(account2.createDate);

        // Khởi tạo object với constructor có các parameters id, Email, Username, FirstName, LastName, Position và default createDate = now
        Account account3 = new Account(2, "another@email.com", "user456", "An", "Phạm", "Manager");
        System.out.println(account3.createDate);

        // Khởi tạo object với constructor có các parameters id, Email, Username, FirstName, LastName, Position và createDate
        LocalDateTime customDate = LocalDateTime.of(2023, 8, 28, 12, 0, 0);
        Account account4 = new Account(3, "third@email.com", "user789", "Hà", "Trương", "Analyst", customDate);
        System.out.println(account4.createDate);
    }
}
