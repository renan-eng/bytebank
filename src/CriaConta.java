public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.pegaSaldo());
        primeiraConta.deposita(100);
        System.out.println(primeiraConta.pegaSaldo());

        Conta segundaConta = new Conta();
        segundaConta.deposita(50);

        System.out.println("Primeira conta tem: " + primeiraConta.pegaSaldo());
        System.out.println("Segunda conta tem: " + segundaConta.pegaSaldo());
        System.out.println("Agencia: " + primeiraConta.agencia);
        System.out.println("Número: " + primeiraConta.numero);
        System.out.println("Titular: " + primeiraConta.titular);

        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}
