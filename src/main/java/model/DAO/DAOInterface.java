package model.DAO;

import model.exception.DatabaseException;

import java.io.IOException;
import java.util.List;

public interface DAOInterface {
    List<GameState> listAll() throws DatabaseException;
    List<GameStateBean> listAllAsBeans() throws DatabaseException;
    GameState insertOrUpdate(GameState gameState) throws DatabaseException;
    void delete(int id) throws DatabaseException;
}
