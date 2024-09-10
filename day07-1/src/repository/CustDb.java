package repository;

import dto.Cust;
import frame.Db;

public class CustDb implements Db<String, Cust> {
    @Override
    public void insert(Cust cust) {
        System.out.println("Inserted: "+cust.getName());
    }

    @Override
    public void update(Cust cust) {
        System.out.println("Updated: "+cust.getName());
    }

    @Override
    public void delete(String s) {
        System.out.println("Deleted: "+s);
    }
}
