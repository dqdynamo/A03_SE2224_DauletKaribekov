class Adapter implements Charger {
    private Charger charger;

    public Adapter(Charger charger) {
        this.charger = charger;
    }

    @Override
    public void charge() {
        charger.charge();
    }
}