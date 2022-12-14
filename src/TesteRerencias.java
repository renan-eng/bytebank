public class TesteRerencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 250;

        Conta segundaConta = primeiraConta;

        System.out.println(segundaConta.saldo);

        segundaConta.saldo += 100;

        System.out.println(segundaConta.saldo);
        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta) {
            System.out.println("As contas são identicas.");
        } else System.out.println("As contas são diferentes");

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
