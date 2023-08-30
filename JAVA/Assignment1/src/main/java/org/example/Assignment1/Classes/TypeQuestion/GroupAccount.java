package org.example.Assignment1.Classes.TypeQuestion;
import java.util.Date;
public class GroupAccount {
    public byte groupID;
    public short accountID;
    public Date JoinDate;
    public GroupAccount(byte groupID, short accountID, Date joinDate) {
        this.groupID = groupID;
        this.accountID = accountID;
        this.JoinDate = joinDate;
    }
}
