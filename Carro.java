
public class Carro {
    private String cor;
    private String modelo;
    private int ano;
    private String marca;
    private String placa;

    public Carro(String cor, String modelo, String marca, int ano, String placa) {
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        this.placa = placa;
    }

    // Métodos getters e setters (ou pode usar os gerados automaticamente pela IDE)

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String modelo) {
        this.placa = modelo;
    }
}