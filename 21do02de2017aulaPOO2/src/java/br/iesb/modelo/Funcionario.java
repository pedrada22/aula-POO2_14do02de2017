
//AULA 3

package br.iesb.modelo;
public class Funcionario {
    private int idFuncionario;
    private String txNome;
    private int niDependentes;
    private double nfSalario;

    //public Funcionario() {
    //}

    public Funcionario(int idFuncionario, String txNome, int niDependentes, double nfSalario) {
        this.idFuncionario = idFuncionario;
        this.txNome = txNome;
        this.niDependentes = niDependentes;
        this.nfSalario = nfSalario;
    }

    public double getNfSalario() {
        return nfSalario;
    }

    public void setNfSalario(double nfSalario) {
        this.nfSalario = nfSalario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getTxNome() {
        return txNome;
    }

    public void setTxNome(String txNome) {
        this.txNome = txNome;
    }

    public int getNiDependentes() {
        return niDependentes;
    }

    public void setNiDependentes(int niDependentes) {
        this.niDependentes = niDependentes;
    }
}