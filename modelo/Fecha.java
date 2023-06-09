package modelo;
public class Fecha
{
    //---Atributos---
    private int dia;
    private int mes;
    private int anio;

    //---Metodos---

    //Constructor
    public Fecha(int dia, int mes, int anio)
    {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    //Metodos de acceso
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    //---Metodo toString
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    @Override
    public boolean equals(Object obj) {
        Fecha otra = (Fecha)obj;
        return (dia == otra.getDia()) && (mes == otra.getMes()) && (anio == otra.getAnio());
    }


    


}