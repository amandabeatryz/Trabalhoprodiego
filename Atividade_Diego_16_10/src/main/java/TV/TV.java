package TV;

public class TV {
    private String versao;

    public TV(String versao) {
        this.versao = versao;
    }

    public String getVersao() {
        return versao;
    }

    public void atualizarVersao(String novaVersao) {
        this.versao = novaVersao;
    }
}