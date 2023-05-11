package ejecutable;

import modelo.Fecha;

public class Test
{
    public static void main(String[] args) {
       Fecha f = new Fecha();
       f.setDia(11);
       f.setMes(5);
       f.setAnio(2023);

       System.out.println("Día = " + f.getDia());
       System.out.println("Mes = " + f.getMes());
       System.out.println("Año = " + f.getAnio());
       System.out.println(f);

    }
}
