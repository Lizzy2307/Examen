public class ServicioDeCable extends OpcionesBancarias
{
    public ServicioDeCable()
    {
        Tpagar(ServicioDeCable.class,0);
        System.out.println("Total a Pagar: "+ Float.valueOf(getPago()));
    }
}
