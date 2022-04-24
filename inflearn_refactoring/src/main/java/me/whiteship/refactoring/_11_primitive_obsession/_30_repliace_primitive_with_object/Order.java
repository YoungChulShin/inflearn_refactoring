package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

public class Order {

    // private Priority priority;
    private PriorityEnum priority;

//    public Order(String priorityValue) {
//        this.priority = new Priority(priorityValue);
//    }

//    public Order(Priority priority) {
//        this.priority = priority;
//    }

    public Order(PriorityEnum priority) {
        this.priority = priority;
    }

    public String getPriorityValue() {
        return this.priority.toString();
    }

    public PriorityEnum getPriority() {
        return priority;
    }
}
