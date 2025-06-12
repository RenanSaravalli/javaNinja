package intermediario.herancaMultipla;

public class Uzumaki extends Ninja{
        private Biju biju;

    public Uzumaki(Biju biju) {
        this.biju = biju;
    }

    public Biju getBiju() {
        return biju;
    }

    public void setBiju(Biju biju) {
        this.biju = biju;
    }
}
