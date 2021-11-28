public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker(10000, "Sergey");
        Manager manager = new Manager(12000, "Ivan", 2);
        Director director = new Director(12000, "Anna", 3);

        Worker[] workers = {worker, manager, director};
        Manager[] managers = {manager, director};

        System.out.println(
                EmployeeHelper.findByName("Sergey", workers).getName()
        );

        System.out.println(
                EmployeeHelper.findBySubName("va", workers).getName()
        );

        System.out.println(
                EmployeeHelper.getMinSubordinates(managers).getName()
        );
    }
}
