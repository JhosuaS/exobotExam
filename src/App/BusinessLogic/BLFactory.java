package BusinessLogic;
import java.util.List;
import java.util.funtion.Supplier;

import DataAccess.IDAO
public class BLFactory<T> {
    private final IDAO<T> oDAO;

    public BLFactory(Supplier<IDAO<T>> daoSupplier) {
        this.oDAO = supplier.get();
    }
    public List<T> getAll() throws Exception {
        return oDAO.readAll();
    }
    public T getBy(Integer id) throws Exception {
        return oDAO.readBy(id);
    }
    public boolean add (T oT) throws Exception {
        return oDAO.create(oT);
    }
    public boolean upd(T oT) throws Exception {
        return oDAO.update(oT);
    }
    public boolean del(Integer id) throws Exception {
        return oDAO.delete(id);
    }

}
