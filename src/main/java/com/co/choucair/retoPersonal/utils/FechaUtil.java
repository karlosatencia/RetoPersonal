package com.co.choucair.retoPersonal.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechaUtil {
    public static String obtenerFechaActualConFormato() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return LocalDateTime.now().format(formatter);
    }

    public static String obtenerFechaConHoraSumada(int horas) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // Sumar las horas
        LocalDateTime nuevaFecha = LocalDateTime.now().plusHours(horas);
        return nuevaFecha.format(formatter);
    }
}
