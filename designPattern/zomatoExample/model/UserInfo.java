package designPattern.zomatoExample.model;

import lombok.Getter;

@Getter
public class UserInfo {
    private final String name;
    private final long cardNo;
    private final long phNo;
    private final String mailId;
    private final String location;

    public UserInfo(String name, long cardNo, long phNo, String mailId, String location) {
        this.name = name;
        this.cardNo = cardNo;
        this.phNo = phNo;
        this.mailId = mailId;
        this.location = location;
    }
}
