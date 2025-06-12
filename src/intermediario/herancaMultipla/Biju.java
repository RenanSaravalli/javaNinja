package intermediario.herancaMultipla;

public enum Biju {
    MATATABI(2, "Matatabi", "Yugito Nii"),
    ISOBU(3, "Isobu", "Yagura"),
    SON_GOKU(4, "Son Goku", "Roshi"),
    KOKUO(5, "Kokuo", "Han"),
    SAIKEN(6, "Saiken", "Utakata"),
    CHOMEI(7, "Chomei", "Fuu"),
    GYUKI(8, "Gyuki", "Killer Bee"),
    KURAMA(9, "Kurama", "Naruto Uzumaki");

    String nomeBiju;
    String nomeHospedeiro;
    int quantidadeDeCaldas;

    Biju() {
    }

    Biju(int quantidadeDeCaldas, String nomeBiju, String nomeHospedeiro) {
        this.quantidadeDeCaldas = quantidadeDeCaldas;
        this.nomeBiju = nomeBiju;
        this.nomeHospedeiro = nomeHospedeiro;
    }

    public String getNomeBiju() {
        return nomeBiju;
    }

    public void setNomeBiju(String nomeBiju) {
        this.nomeBiju = nomeBiju;
    }

    public String getNomeHospedeiro() {
        return nomeHospedeiro;
    }

    public void setNomeHospedeiro(String nomeHospedeiro) {
        this.nomeHospedeiro = nomeHospedeiro;
    }

    public int getQuantidadeDeCaldas() {
        return quantidadeDeCaldas;
    }

    public void setQuantidadeDeCaldas(int quantidadeDeCaldas) {
        this.quantidadeDeCaldas = quantidadeDeCaldas;
    }

}
