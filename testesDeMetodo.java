public class testesDeMetodo {
    public static void main(String[] args) {
        Conta contaXYZ = new Conta();
        contaXYZ.saldo = 3000;
        contaXYZ.titular = "Maria";
        contaXYZ.agencia = 2300;
        contaXYZ.numero = 1352;
        System.out.println("Titular: " + contaXYZ.titular);
        System.out.println("Saldo ativo: " + contaXYZ.saldo);
        System.out.println("Número da conta: " + contaXYZ.numero);
        System.out.println("Agência: " + contaXYZ.agencia);
        contaXYZ.deposita(350.73);
        contaXYZ.saca(492.78);
        System.out.println("Saldo pós movimentações: " + contaXYZ.saldo);
    }
}
