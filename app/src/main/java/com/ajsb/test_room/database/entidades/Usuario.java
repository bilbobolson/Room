package com.ajsb.test_room.database.entidades;

/**
 * Antonio José Sánchez
 * Programación Multimedia y de Dispositivos Móviles
 * curso 2020/21
 */

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "usuario")
public class Usuario
{
    @PrimaryKey(autoGenerate = true)
    private int idUsu ;

    @ColumnInfo(name = "nombre")
    private String nombre ;

    @ColumnInfo(name = "apellidos")
    private String apellidos ;

    @ColumnInfo(name = "foto")
    private String foto ;

    /**
     * @return
     */
    public int getIdUsu() {
        return idUsu;
    }

    /**
     * @param idUsu
     */
    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    /**
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }
}
