package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.indirect_inheritance;

public class Employee {

    private final String name;

    private final EmployeeType type;

    protected Employee(String name, String typeValue) {
        this.name = name;
        this.type = employeeType(typeValue);
    }

    private EmployeeType employeeType(String typeValue) {
        return switch (typeValue) {
            case "engineer" -> new EngineerType();
            case "manager" -> new ManagerType();
            case "salesman" -> new SalesmanType();
            default -> throw new IllegalArgumentException(typeValue);
        };
    }

    public String capitalizedType() {
        return this.type.capitalize();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + type.toString() + '\'' +
                '}';
    }
}
