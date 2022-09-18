public class CriaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        primeiraConta.titular = "Pedro";
        System.out.println(primeiraConta.titular + " tem R$" + primeiraConta.saldo + " na sua conta");

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        segundaConta.titular = "Maria";
        System.out.println(segundaConta.titular + " tem R$" + segundaConta.saldo + " na sua conta");

        double valor = 100;

        System.out.println(primeiraConta.titular + " transferiu R$" + valor + " para " + segundaConta.titular);

        primeiraConta.transfere(100, segundaConta);
        System.out.println(primeiraConta.titular + " ficou com R$" + primeiraConta.saldo + " na conta e "
                + segundaConta.titular + " ficou com R$" + segundaConta.saldo);
    }
}
