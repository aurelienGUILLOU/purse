package argent;

import verrou.CodeSecret;

public class Purse {

    private CodeSecret codesecret;
    private double solde;

    public Purse(CodeSecret codeSecret){
        this.codesecret = codeSecret;

    }

    public void debite(double montantDebit, String code) throws TransactionRejetterException {
        if(!codesecret.verifierCode(code)) throw new TransactionRejetterException();
        solde-=montantDebit;
    }

    public double getSolde() {
        return solde;
    }

    public void credite(double montantCredit) {
        solde = montantCredit;
    }


}
