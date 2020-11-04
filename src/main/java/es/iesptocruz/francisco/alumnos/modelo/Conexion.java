package es.iesptocruz.francisco.alumnos.modelo;

import java.sql.Connection;

public class Conexion {
    //tablas
    public static final String TALUMNOS = "alumnos";
    //registros
    public static final String TALUMNOS_DNI = "dni";
    public static final String TALUMNOS_NOMBRE = "nombre";
    public static final String TALUMNOS_APELLIDOS = "apellidos";
    public static final String TALUMNOS_NOTA = "nota";
    //parámetros de conexión
    private String jdbcURL;
    private String user;
    private String passwd;
    //atributos de clase
    private Connection connection;
    private static Conexion conexion;

    public Conexion(String db) {
        jdbcURL = "jdbc:mysql://localhost:3306/"+db+"?serverTimezone=UTC";
        cargarDriver();
        musql();
    }

    public static void crgarDriver(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){

        }
    }
}
