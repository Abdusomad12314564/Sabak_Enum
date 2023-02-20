public enum City {
    ER_RIAD("МЕККЕ, МЕДИНА"),
    DOHA("ДУБАЙ"),
    BISHKEK("ТЕЦ, ТҮТҮН"),
    PARIS("ЕЙФЕЛ МУНАРАСЫ"),
    COIR("ПИРАМИДАЛАР");

    private String word;

    City(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "\n"+super.toString()+ " Өзгөчөлүгү = " + word;
    }
}
