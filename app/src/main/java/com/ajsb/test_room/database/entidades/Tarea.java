package com.ajsb.test_room.database.entidades;

/**
 * Antonio José Sánchez
 * Programación Multimedia y de Dispositivos Móviles
 * curso 2020/21
 */

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tarea")
public class Tarea
{
    @PrimaryKey(autoGenerate = true)
    private int idTar ;

    @ColumnInfo(name = "tarea")
    private String tarea ;

    @ColumnInfo(name = "fecha")
    private String fecha ;

    @ColumnInfo(name = "finalizada")
    private boolean finalizada ;

    public Tarea(String tarea, String fecha)
    {
        this.tarea      = tarea ;
        this.fecha      = fecha ;
        this.finalizada = false ;
    }

    /**
     * @return
     */
    public int getIdTar() {
        return idTar;
    }

    /**
     * @param idTar
     */
    public void setIdTar(int idTar) {
        this.idTar = idTar;
    }

    /**
     * @return
     */
    public String getTarea() {
        return tarea;
    }

    /**
     * @param tarea
     */
    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    /**
     * @return
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return
     */
    public boolean isFinalizada() {
        return finalizada;
    }

    /**
     * @param finalizada
     */
    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
}
