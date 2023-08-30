package org.example;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Group {
    private String groupName;
    private String creator;
    private Account[] accounts;
    private LocalDateTime createDate;

    // Constructor không có parameters
    public Group() {
        this.createDate = LocalDateTime.now();
    }

    // Constructor có các parameters GroupName, Creator, array Account[] accounts, CreateDate
    public Group(String groupName, String creator, Account[] accounts, LocalDateTime createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }

    // Constructor có các parameters GroupName, Creator, array String[] usernames, CreateDate
    public Group(String groupName, String creator, String[] usernames, LocalDateTime createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;

        this.accounts = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            this.accounts[i] = new Account(0, null, usernames[i], null, null);
        }
    }

    public void display() {
        // Khởi tạo object với constructor không có parameters
        Group group1 = new Group();
        System.out.println(group1.createDate);

        // Khởi tạo object với constructor có các parameters GroupName, Creator, array Account[] accounts, CreateDate
        Account[] accounts = {
                new Account(1, "user1@email.com", "user1", "Alice", "Smith"),
                new Account(2, "user2@email.com", "user2", "Bob", "Johnson")
        };
        Group group2 = new Group("Group A", "admin", accounts, LocalDateTime.now());
        System.out.println(group2.createDate);

        // Khởi tạo object với constructor có các parameters GroupName, Creator, array String[] usernames, CreateDate
        String[] usernames = {"user3", "user4", "user5"};
        Group group3 = new Group("Group B", "manager", usernames, LocalDateTime.now());
        System.out.println(group3.createDate);
    }
}
