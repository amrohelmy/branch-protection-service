package io.simplersoftware.updatebranchprotection.message.model;

public class Owner {

    private String login;

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "login='" + login + '\'' +
                '}';
    }
}
