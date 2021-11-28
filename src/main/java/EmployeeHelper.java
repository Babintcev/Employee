public class EmployeeHelper {

    public static Employee findByName(String name, Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (name.equals(array[i].getName())) {
                return array[i];
            }
        }

        return null;
    }

    public static Employee findBySubName(String subName, Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getName().contains(subName)) {
                return array[i];
            }
        }

        return null;
    }

    public static int getSalarySum(Employee[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i].getSalary();
        }

        return result;
    }

    public static Manager getMinSubordinates(Manager[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        Manager result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (result.getNumberOfSubordinates() > array[i].getNumberOfSubordinates()) {
                result = array[i];
            }
        }

        return result;
    }

}
