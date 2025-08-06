package DataAccess.DAO;

import DataAccess.DAO.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import DTO.DTOPersonaTipo;
import DataAccess.DataHelperSQLite;
import DataAccess.IDAO;

public class DAOPersonaTipo extends DataHelperSQLite implements IDAO<DTOPersonaTipo>{

    @Override
    public DTOPersonaTipo readBy(Integer id) throws SQLException {
        DTOPersonaTipo dto = new DTOPersonaTipo();
        String query = "SELECT IdPersonaTipo "
                        + " , Tipo "
                        + " , Estado "
                        + " , FechaCreacion "
                        + " , FechaModifica "
                        + " FROM PersonaTipo "
                        + " WHERE Estado = 'A' and IdPersonaTipo = " + id.toString();
        try {
            Connection conn = openConnection();
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(query);
            while(rs.next()) {
                dto = new DTOPersonaTipo(rs.getInt(1)
                                    , rs.getString(2)
                                    , rs.getString(3)
                                    , rs.getString(4)
                                    , rs.getString(5));
            }
        }
        catch(SQLException e) {
            throw e;
        }
        return dto;
    }

    @Override
    public List<DTOPersonaTipo> readAll() throws SQLException {
        DTOPersonaTipo dto = new DTOPersonaTipo();
        List<DTOPersonaTipo> lst = new ArrayList<>();
        String query = "SELECT IdPersonaTipo "
                        + " , Tipo "
                        + " , Estado "
                        + " , FechaCreacion "
                        + " , FechaModifica "
                        + " FROM PersonaTipo "
                        + " WHERE Estado = 'A' ";
        try {
            Connection conn = openConnection();
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(query);
            while(rs.next()) {
                dto = new DTOPersonaTipo(rs.getInt(1)
                                    , rs.getString(2)
                                    , rs.getString(3)
                                    , rs.getString(4)
                                    , rs.getString(5));
            lst.add(dto);
            }
        }
        catch(SQLException e) {
            throw e;
        }
        return lst;    
    }

    @Override
    public boolean create(DTOPersonaTipo entity) throws SQLException {
        String query = "INSERT INTO PersonaTipo (Tipo) VALUES (?)";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getTipo());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }    
    }

    @Override
    public boolean update(DTOPersonaTipo entity) throws SQLException {
          if (entity.getIdPersonaTipo() == null) {
              throw new SQLException("IdPersonaTipo cannot be null for update operation");
          }
         String query = "UPDATE PersonaTipo SET Tipo = ?, Estado = ?, FechaModifica = datetime('now', 'localtime') WHERE IdPersonaTipo = ?";
          try {
                Connection conn = openConnection();
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setString(1, entity.getTipo());
                pstmt.setString(2, getDataTimeNow());
                pstmt.setInt(3, entity.getIdPersonaTipo());
                pstmt.executeUpdate();
                return true;
          } catch (SQLException e) {
                throw e;
          }    
    }

    @Override
    public boolean delete(Integer id) throws SQLException {
        String query = "UPDATE PersonaTipo SET Estado = ?, FechaModifica = ? WHERE IdPersonaTipo = ?";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "X"); 
            pstmt.setString(2, getDataTimeNow());
            pstmt.setInt(3, id);
            return true;
        } catch (SQLException e) {
            throw e;
        }    
    }

    private Connection openConnection() {
        try {
            String url = "jdbc:sqlite:db/Exobot.sqlite"; // Cambia el nombre/path si tu base es diferente
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            throw new RuntimeException("No se pudo conectar a la base de datos", e);
        }
    }

    private String getDataTimeNow() {
        return "datatime('now', 'localtime')";
    }
    
}
