package ual.hmis.sesion06.ejercicio4;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class MezclaLinealTest {

	
	
	public static List<Arguments> datosDePrueba() {
        return List.of(
            Arguments.of(List.of(1, 3, 5), List.of(2, 4, 6), List.of(1, 2, 3, 4, 5, 6)),
            Arguments.of(List.of(1, 2), List.of(3, 4), List.of(1, 2, 3, 4)),
            Arguments.of(List.of(5, 6), List.of(1, 2), List.of(1, 2, 5, 6)),
            Arguments.of(List.of(), List.of(1, 2, 3), List.of(1, 2, 3)),
            Arguments.of(List.of(1, 2, 3), List.of(), List.of(1, 2, 3)),
            Arguments.of(List.of(), List.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("datosDePrueba")
    public void testMezclaConEnteros(List<Integer> l1, List<Integer> l2, List<Integer> esperado) {
        List<Integer> resultado = MezclaLineal.mezcla(l1, l2);
        assertEquals(esperado, resultado);
    }
}
