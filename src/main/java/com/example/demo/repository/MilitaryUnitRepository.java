package com.example.demo.repository;

import com.example.demo.entity.MilitaryUnit;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public class MilitaryUnitRepository implements Repository<MilitaryUnit, String> {
    private DataStore store;

    @Autowired
    public MilitaryUnitRepository(DataStore store) {
        this.store = store;
    }

    @Override
    public Optional<MilitaryUnit> find(String id) {
        return store.findMilitaryUnit(id);
    }

    @Override
    public List<MilitaryUnit> findAll() {
        return store.findAllMilitaryUnits();
    }

    @Override
    public void create(MilitaryUnit entity) {
        store.createMilitaryUnit(entity);
    }

    @Override
    public void delete(MilitaryUnit entity) {
        throw new UnsupportedOperationException("Operation not implemented.");
    }

    @Override
    public void update(MilitaryUnit entity) {
        throw new UnsupportedOperationException("Operation not implemented.");
    }
}
