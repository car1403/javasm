package app;

import dto.Cust;
import frame.Db;
import repository.CustDb;

public class Main {
    public static void main(String[] args) {
        Db db = new CustDb();
        Cust cust = new Cust("id01","pwd01","james");
        db.insert(cust);
    }
}
