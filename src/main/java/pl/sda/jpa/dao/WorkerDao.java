package pl.sda.jpa.dao;

import pl.sda.jpa.model.Worker;

import java.util.List;

import static pl.sda.jpa.util.JpaUtil.getEntityManager;

public class WorkerDao implements GenericDao<Worker> {
    @Override
    public Worker get(long id) {
        return getEntityManager().find(Worker.class, id);
    }

    @Override
    public List<Worker> getAll() {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Worker create(Worker entity) {
        getEntityManager().persist(entity);
        return null;
    }

    @Override
    public Worker update(Worker entity) {
        return null;
    }
}
