package com.ajsb.test_room.database;

/**
 * Antonio José Sánchez
 * Programación Multimedia y de Dispositivos Móviles
 * curso 2020/21
 */

import android.content.Context;

import androidx.room.Room;

public class Database
{
    private todoDao dao ;
    private static Database instancia = null ;

    private Database(Context contexto)
    {
        // Construimos la interfaz de acceso a la base de datos
        todoDatabase tddb ;
        tddb = Room.databaseBuilder(contexto, todoDatabase.class, "todolist")
                   .allowMainThreadQueries()
                   .build() ;
        //
        // Guardamos la interfaz de acceso
        dao = tddb.todoDAO() ;
    }

    /**
     * Implementamos el patrón SINGLETON
     *
     * @param contexto
     * @return
     */
    public static Database getDatabase(Context contexto)
    {
        if (instancia==null) instancia = new Database(contexto) ;
        return instancia ;
    }

    /**
     * Proporciona acceso a la interfaz y, por tanto, a los métodos que
     * definimos previamente.
     *
     * @return
     */
    public todoDao getDao() { return dao ; }

}


