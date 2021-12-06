package Account;

public class Konto {
    private String login;
    private String haslo;
    private String adresEmail;

    public Konto(String login, String haslo, String adresEmail) {
        this.login = login;
        this.haslo = haslo;
        this.adresEmail = adresEmail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public String getAdresEmail() {
        return adresEmail;
    }

    public void setAdresEmail(String adresEmail) {
        this.adresEmail = adresEmail;
    }
}
