package sistemExceptions;

public class DepositoIndevido extends RuntimeException{

    public DepositoIndevido (String mensagem) {
        super(mensagem);
    }
}