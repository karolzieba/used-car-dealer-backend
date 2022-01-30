package pl.usedcardealer.usedcardealer.Account;

import javax.persistence.Embeddable;

@Embeddable
public class Account {
    private String login;
    private String password;
    private String emailAddress;

    public Account() { }

    public Account(String login, String password, String emailAddress) {
        this.login = login;
        this.password = password;
        this.emailAddress = emailAddress;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
