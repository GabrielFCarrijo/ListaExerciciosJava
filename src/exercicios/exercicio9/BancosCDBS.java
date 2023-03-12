package exercicios.exercicio9;

public class BancosCDBS {

    private Integer taxaSelic;
    private Integer taxaAdm;
    private Integer impostRendimento;

    public BancosCDBS() {
    }

    public BancosCDBS(Integer taxaSelic, Integer taxaAdm, Integer impostRendimento) {
        this.taxaSelic = taxaSelic;
        this.taxaAdm = taxaAdm;
        this.impostRendimento = impostRendimento;
    }

    public Integer getTaxaSelic() {
        return taxaSelic;
    }

    public void setTaxaSelic(Integer taxaSelic) {
        this.taxaSelic = taxaSelic;
    }

    public Integer getTaxaAdm() {
        return taxaAdm;
    }

    public void setTaxaAdm(Integer taxaAdm) {
        this.taxaAdm = taxaAdm;
    }

    public Integer getImpostRendimento() {
        return impostRendimento;
    }

    public void setImpostRendimento(Integer impostRendimento) {
        this.impostRendimento = impostRendimento;
    }
}
