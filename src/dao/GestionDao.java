package dao;
import java.sql.SQLException;
import java.util.List;

//interface generic
public interface GestionDao<T>{
//Pas de constructeur
//Pas d'attribut non static
//Pas de definition de fonction
//Pas de toString
int insert (T t) throws SQLException;
int delete (int id);
int update (T t);
List <T> findAll() throws SQLException;
}
