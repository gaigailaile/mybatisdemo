package com.gai.entity;

public class Users {

    private int ids;

    private String names;

    private int ages;

    public int getIds() {
        return ids;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    @Override
    public String toString() {
        return "Users{" +
                "ids=" + ids +
                ", names='" + names + '\'' +
                ", ages=" + ages +
                '}';
    }
}
