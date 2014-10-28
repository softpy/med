/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;
import javax.swing.JOptionPane;

public class ver_conex{
    public String user ="postgres";
    public String pass ="SoporteTec";
    public String bd   ="poha";
    
//    public String user = "usuario";
//    public String pass = "camalote";
//    public String bd   = "ustrrhh";
   
//    public String user = "postgres";
//    public String pass = "Soporteagosto2012";
//    public String bd   = "ustrrhh";
    
    //public final String host = "jdbc:postgresql://192.168.0.16:5432/";
    public final String host = "jdbc:postgresql://localhost:5432/";
    public final String app ="?ApplicationName=MediCal";
    //jdbc:postgresql://localhost:5435/MyDB?application-name=MyApp
    public Connection conexion = null; 
    public Statement sentencia; 
    public ResultSet resultado;
    public PreparedStatement preparar;
    
    public ver_conex()/* constructor*/{
        try{
            Class.forName("org.postgresql.Driver");//Se registra el Driver jdbc de Postgres
            conexion = DriverManager.getConnection(host+bd+app,user,pass);                                                    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Hubo un problema con la conexion.\n"+e,"Verifiquelo",JOptionPane.INFORMATION_MESSAGE);
        }
    }
 }
