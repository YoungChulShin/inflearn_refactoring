package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.indirect_inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void capitalizedType() {

        List<String> strings = new ArrayList<>(Arrays.asList("1", "2", "3"));
        strings.add("1");


        assertEquals("Manager", new FullTimeEmployee("keesun", "manager").capitalizedType());
        assertEquals("Engineer", new PartTimeEmployee("keesun", "engineer").capitalizedType());
        assertThrows(IllegalArgumentException.class, () -> new Employee("keesun", "wrong type"));
    }

}