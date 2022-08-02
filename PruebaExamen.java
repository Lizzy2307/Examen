import java.util.Scanner;

public class PruebaExamen
{
    public static void main(String args[])
    {
        int opcion;

        System.out.println("¿Que transaccion desea realizar?");
        System.out.println("1.Opcion 1 Servicio de agua");
        System.out.println("2.Opcion 2 Servicio de cable");
        Scanner scan=new Scanner(System.in);
        opcion=scan.nextInt();
        if (opcion==1){
            System.out.println("Lectura anterior: ");
            int LecAnt=scan.nextInt();
            System.out.println("Lectura actual: ");
            int LecAct=scan.nextInt();
            ServicioDeAgua agua=new ServicioDeAgua(Float.valueOf(LecAnt), Float.valueOf(LecAct));
        }
        else if(opcion==2)
        {
            ServicioDeCable cable=new ServicioDeCable();
        }
        else
        {
            System.out.println("La opcion es incorrecta");
        }
    }
}
