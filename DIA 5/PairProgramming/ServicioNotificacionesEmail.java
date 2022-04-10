package PairProgramming;

public class ServicioNotificacionesEmail implements ServicioNotificaciones {
    @Override
    public void sendNotificacion(String medio) {
        medio = "email";
    }

}