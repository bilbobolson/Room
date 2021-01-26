package com.ajsb.test_room.database;

/**
 * Antonio José Sánchez
 * Programación Multimedia y de Dispositivos Móviles
 * curso 2020/21
 */

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.ajsb.test_room.database.entidades.Tarea;

import java.util.List;

/**
 * En la interfaz definimos los métodos que nos permitirán acceder
 * a la base de datos para realizar las tareas necesarias.
 */

@Dao
public interface todoDao
{
    /**
     * Devuelve una lista con todas las tareas almacenadas en la
     * base de datos.
     *
     * @return
     */
    @Query("SELECT * FROM tarea")
    List<Tarea> getAllTasks() ;

    /**
     * Busca una tarea por su identificador y la devuelve.
     *
     * @return
     */
    @Query("SELECT * FROM tarea WHERE idTar = :idt")
    public Tarea getTaskById(int idt) ;

    /**
     * Inserta una tarea en la base de datos
     * @param tarea
     */
    @Insert
    void insertTask(Tarea tarea) ;

    /**
     * Actualiza la información de una tarea en la base de datos
     * @param tarea
     */
    @Update
    void updateTask(Tarea tarea) ;

    /**
     * Elimina una tarea de la base de datos
     * @param tarea
     */
    @Delete
    void deleteTask(Tarea tarea) ;
}
