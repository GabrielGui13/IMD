class Circulo extends Forma {
    private float raio;
    public Circulo(float raio) {
        this.raio = raio;
    }
    @Override
    public float calcularArea() {
        return String.format("%.2f", (float) Math.PI * Math.pow(raio, 2));
    }
    @Override
    public float
}
