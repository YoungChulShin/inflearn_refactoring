package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderProcessorTest {

//    @Test
//    void numberOfHighPriorityOrders() {
//        OrderProcessor orderProcessor = new OrderProcessor();
//        long highPriorityOrders = orderProcessor.numberOfHighPriorityOrders(
//                List.of(new Order("low"),
//                        new Order("normal"),
//                        new Order("high"),
//                        new Order("rush")));
//        assertEquals(2, highPriorityOrders);
//    }

    @Test
    void numberOfHighPriorityOrders() {
        OrderProcessor orderProcessor = new OrderProcessor();
        long highPriorityOrders = orderProcessor.numberOfHighPriorityOrders(
            List.of(new Order(PriorityEnum.LOW),
                new Order(PriorityEnum.NORMAL),
                new Order(PriorityEnum.HIGH),
                new Order(PriorityEnum.RUSH)));
        assertEquals(2, highPriorityOrders);
    }

}