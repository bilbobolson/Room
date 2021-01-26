package com.ajsb.test_room.database;

/**
 * Antonio José Sánchez
 * Programación Multimedia y de Dispositivos Móviles
 * curso 2020/21
 */

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.ajsb.test_room.database.entidades.Tarea;
import com.ajsb.test_room.database.entidades.Usuario;

@Database(entities = { Usuario.class, Tarea.class }, version = 1)
public abstract class todoDatabase extends RoomDatabase
{
    /**
     * Definimos un método que nos permita acceder a los métodos
     * de la intefaz que definimos previamente.
     *
     * @return
     */
    public abstract todoDao todoDAO() ;
}
