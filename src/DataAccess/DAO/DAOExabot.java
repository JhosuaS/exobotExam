package DataAccess.DAO;
import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.DTOExabot;
import DataAccess.DataHelperSQLite;
import DataAccess.IDAO;
public class DAOExabot extends DataHelperSQLite implements IDAO<DTOExabot> {

public List<DTOExabot> readAll(Integer idIABot) throws {
    DTOExabot dto;
    List<DTOExabot> list = new ArrayList<>();
    String query =" SELECT IdExabot"
                 + "      ,IdIABot "
                 + "      ,Serie "
                 + "      ,Estado "
                 + "      ,FechaCreacion "
                 + "      ,FechaModifica "
                 + " FROM Exabot "
                 + " WHERE Estado= 'A' AND IdIABot = " + idIABot.toString();
    try {
        Conecction conn = openConnection();
        Statement  stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(query);
        while (rs.next()) {
            dto = new DTOExabot( rs.getInt(1))
                                ,rs.getInt(2)
                                ,rs.getString(3)
                                ,rs.getString(4)
                                ,rs.getString(5)
                                ,rs.getString(6)
                                );
            lst.add(dto);
        }                     
    }
    catch (SQLException e) {
        throw e;
    }
    return lst; 
 }
}