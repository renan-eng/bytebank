public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 200;
        conta.deposita(50);
        System.out.println(conta.saldo);

        boolean saqueRetorno = conta.saca(260);
        System.out.println(conta.saldo);
        System.out.println(saqueRetorno);
    }
}
