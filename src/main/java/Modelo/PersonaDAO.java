
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author steven
 */
public class PersonaDAO{
    private static final String SQL_READALL="select * from Persona ";
    private static final ConexionBD con = new ConexionBD();
    public PersonaDAO() {
        con.conectar();
    }
    public List<PersonaDTO> readAll(){
        List<PersonaDTO> lista = null;
        PreparedStatement ps;
        try {
            ps = con.getConexion().prepareStatement(SQL_READALL);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()){
                PersonaDTO obj = new PersonaDTO(rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("correo"),
                        rs.getString("telefono"),
                        rs.getString("clave"));
                lista.add(obj);
            }
        } catch (SQLException ex) {
            System.out.println("Error al conectar: "+ ex);
        }
        return lista;
    }
    
    public void insertar(PersonaDTO objP){
        String SQL_INSERTION = "INSERT INTO Persona (nombre,apellido,telefono,correo,telefono,clave) values (?,?,?,?,?,?)";
        String nombre = objP.getNombre();
        String apellido = objP.getApellido();
        String correo = objP.getCorreo();
        String telefono = objP.getTelefono();
        String clave = objP.getClave();
        PreparedStatement ps;
        try {
            ps = con.getConexion().prepareStatement(SQL_INSERTION);
            ps.setString(1,nombre);
            ps.setString(2,apellido);
            ps.setString(3,correo);
            ps.setString(4,telefono);
            ps.setString(5,clave);
            ps.setString(6,nombre);
        } catch (SQLException ex) {
            System.out.println("No se pudo agregar el usuario: "+ex);
        }
    }
    
    public void buscar(PersonaDTO objP){
        String SQL_INSERTION = "SELECT * FROM Persona WHERE ";
        String nombre = objP.getNombre();
        String apellido = objP.getApellido();
        String correo = objP.getCorreo();
        String telefono = objP.getTelefono();
        String clave = objP.getClave();
        PreparedStatement ps;
        try {
            ps = con.getConexion().prepareStatement(SQL_INSERTION);
            ps.setString(1,nombre);
            ps.setString(2,apellido);
            ps.setString(3,correo);
            ps.setString(4,telefono);
            ps.setString(5,clave);
            ps.setString(6,nombre);
        } catch (SQLException ex) {
            System.out.println("No se pudo agregar el usuario: "+ex);
        }
    }
}
