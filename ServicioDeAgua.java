import java.time.*;

public class ServicioDeAgua extends OpcionesBancarias
{
    public ServicioDeAgua(float LecAnt, float LecAct)
    {
        Tpagar(ServicioDeAgua.class, LecAct-LecAnt);
        System.out.println("************* SERVICIO DE AGUA **************");
        System.out.println("Total a Pagar: "+ Float.valueOf(getPago()));
    }
}
