public class OpcionesBancarias{

    private float Pago;
    private Class opcion;


    public void Tpagar(Class opcion, float LecAct)
    {
        if(opcion== ServicioDeCable.class)
        {
            setPago(Float.valueOf(500));
        }
        else if(opcion == ServicioDeAgua.class)
        {
            if(LecAct<=10)
            {
                setPago(LecAct*(10));
            } 
            else if(LecAct<30)
            {
                setPago(((LecAct-30)*Float.valueOf("12.5"))+100);
            }
            else
            {
                setPago(((LecAct-30)*15)+350);
            }
        }
        else
        {
            System.out.println("Incorrecto");
        }

    }

    public void setPago(float Pago)
    {
        this.Pago=Pago;
    }

    public float getPago()
    {
        return this.Pago;
    }
}