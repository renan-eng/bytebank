public class TesteRerencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        primeiraConta.deposita(250);

        Conta segundaConta = primeiraConta;

        System.out.println(segundaConta.getSaldo());

        segundaConta.deposita(100);

        System.out.println(segundaConta.getSaldo());
        System.out.println(primeiraConta.getSaldo());

        if(primeiraConta == segundaConta) {
            System.out.println("As contas são identicas.");
        } else System.out.println("As contas são diferentes");

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
