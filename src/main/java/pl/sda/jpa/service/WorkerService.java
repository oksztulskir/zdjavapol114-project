package pl.sda.jpa.service;

import lombok.RequiredArgsConstructor;
import pl.sda.jpa.dao.WorkerDao;
import pl.sda.jpa.model.Worker;

@RequiredArgsConstructor
public class WorkerService {
    private final WorkerDao dao;

    public void create(String firstName, String lastName) {
        Worker worker = new Worker();
        worker.setFirstName(firstName);
        worker.setLastName(lastName);
        dao.create(worker);
    }
}
