package org.example;

import junit.framework.TestCase;

public class MiClaseTest extends TestCase {

    public void testGetNombre() {
        MiClase instance = new MiClase("Juan");
        String expResult = "Juan";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    public void testSetNombre() {
        String nombre = "Juan";
        MiClase instance = new MiClase("Pedro");
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
    }
}