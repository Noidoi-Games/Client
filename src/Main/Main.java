package Main;

public class Main {
    public static void main(String[] args) {

        IdAndPass idAndPass = new IdAndPass();

        LoginPage loginPage = new LoginPage(idAndPass.getLoginInfo());
    }
}
