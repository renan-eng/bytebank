public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaMaria = new Conta();
        contaMaria.saldo = 200;
        contaMaria.deposita(50);
        System.out.println(contaMaria.saldo);

        boolean saqueRetorno = contaMaria.saca(260);
        System.out.println(contaMaria.saldo);
        System.out.println(saqueRetorno);

        Conta contaJoao = new Conta();
        contaJoao.deposita(120);
//        contaJoao.transfere(20, contaMaria);
        boolean transfereSucesso = contaJoao.transfere(20, contaMaria);
        System.out.println("Saldo da conta Joao: " + contaJoao.saldo);
        System.out.println("Saldo da conta Maria: " + contaMaria.saldo);
        System.out.println(transfereSucesso);

    }
}
