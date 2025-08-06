package DataAccess;

import java.util.List;

public interface IDAO<T> {  //Obligatorio implementar los métodos CRUD en los DAOs
    T readBy(Integer id)       throws Exception;
    List<T> readAll()          throws Exception;
    boolean create(T entity)   throws Exception;
    boolean update(T entity)   throws Exception;
    boolean delete(Integer id) throws Exception;
    Integer getMaxReg()        throws Exception;
}
