package POO.Ejercicio1;

public class Terreno {

    private int codigo;
    private double base;
    private double altura;
    private int manzana;

    // constructores
    public Terreno(int cod) {
        this.codigo = cod;
        this.base = 0;
        this.altura = 0;
    }

    public Terreno(int cod, double ba, double al, int man) {
        this.codigo = cod;
        this.base = ba;
        this.altura = al;
        this.manzana = man;
    }

    // Observadores
    public int getCodigo() {
        return codigo;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public int getManzana() {
        return manzana;
    }

    public String toString() {
        return "codigo:" + codigo +
                "\nbase:" + base +
                "\naltura:" + altura +
                "\nmanzana:" + manzana;
    }

    public boolean equals(Terreno ter) {
        return codigo == ter.codigo;
    }

    // Modificadores

    public void setCodigo(int cod) {
        this.codigo = cod;
    }

    public void setBase(double ba) {
        this.base = base;
    }

    public void setAltura(double al) {
        this.altura = al;
    }

    // Propias del tipo

    public double perimetro(double ba, double al) {
        double perimetro;
        perimetro = 2 * ba + 2 * al;
        return perimetro;
    }

    public double superficie(double ba, double al) {
        double superficie;
        superficie = ba * al;
        return superficie;
    }

}