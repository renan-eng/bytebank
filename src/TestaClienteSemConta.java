public class TestaClienteSemConta {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();

//        contaDaMarcela.titular.nome = "Marcela";
        contaDaMarcela.titular = new Cliente();
        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);

    }
}
