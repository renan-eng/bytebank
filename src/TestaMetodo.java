public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaMaria = new Conta();
        contaMaria.deposita(200);
        contaMaria.deposita(50);
        System.out.println(contaMaria.getSaldo());

        boolean saqueRetorno = contaMaria.saca(260);
        System.out.println(contaMaria.getSaldo());
        System.out.println(saqueRetorno);

        Conta contaJoao = new Conta();
        contaJoao.deposita(120);
//        contaJoao.transfere(20, contaMaria);
        boolean transfereSucesso = contaJoao.transfere(20, contaMaria);
        System.out.println("Saldo da conta Joao: " + contaJoao.getSaldo());
        System.out.println("Saldo da conta Maria: " + contaMaria.getSaldo());
        System.out.println(transfereSucesso);

//        Composição de Objetos
        Cliente joao = new Cliente();
        joao.nome      = "Joao Almeida";
        joao.cpf       = "111.111.111-11";
        joao.profissao = "programador";

        contaJoao.titular = joao;

        System.out.println(contaJoao.titular.nome);
        System.out.println(contaJoao.titular);
        System.out.println(joao);


    }
}
