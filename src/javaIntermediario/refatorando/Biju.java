package javaIntermediario.refatorando;

public enum Biju {

    SHUKAKU(1, "Shukaku", "Gaara"),

    MATATABI(2,"Matatabi","Yugito Nii"),

    ISOBU(3,"Isobu","Yagura"),

    SON_GOKU(4,"Son Goku","Roshi"),

    KOKUO(5,"Kokuo","Han"),

    SAIKEN(6,"Saiken","Utakata"),

    CHOMEI(7,"Chomei","Fuu"),

    GYUKI(8,"Gyuki","Killer Bee"),

    KURAMA(9,"Kurama","Naruto Uzumaki");

    private int numeroCaldas;
    private String nomeBiju;
    private String jinchuriki;


    Biju() {
    }

    Biju(int numeroCaldas, String nomeBiju, String jinchuriki) {
        this.numeroCaldas = numeroCaldas;
        this.nomeBiju = nomeBiju;
        this.jinchuriki = jinchuriki;
    }

    public String getNomeBiju() {
        return nomeBiju;
    }

    public String getJinchuriki() {
        return jinchuriki;
    }

    public int getNumeroCaldas() {
        return numeroCaldas;
    }
}
