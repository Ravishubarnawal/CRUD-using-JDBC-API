package CRUD;

public class LaptopService {

    LaptopRepo laptoprepo = new LaptopRepo();

    public void createLaptop(Laptop laptop) throws Exception {
        laptoprepo.create(laptop);
    }

    public Laptop getLaptopById(int Id) throws Exception {
        return laptoprepo.read(Id);
    }

    public void updateLaptop(Laptop laptop) throws Exception {
        laptoprepo.update(laptop);

    }
    public void deleteLaptop(int Id) throws Exception {
        laptoprepo.delete(Id);
    }
}

