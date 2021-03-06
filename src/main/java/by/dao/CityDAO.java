package by.dao;

import by.entity.City;

import java.util.List;

public interface CityDAO {
    List<City> getAll();
    City get(Long id);
    void create(City city);
    void update(City city);
    void delete(Long id);
    List<City> getByName(String name);
}
