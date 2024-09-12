public class Main {
    public static void main(String[] args) {
        Universidade princeton = new Universidade("Universidade de Princeton");
        Universidade cambridge = new Universidade("Universidade de Cambridge");

        Pessoa einstein = new Pessoa("Albert Einstein", "14/03/1879", princeton);
        Pessoa newton = new Pessoa("Isaac Newton", "4/01/1643", cambridge);
    }
}
