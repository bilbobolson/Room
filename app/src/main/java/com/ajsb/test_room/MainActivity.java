package com.ajsb.test_room;

/**
 * Antonio J. Sánchez Bujaldón
 * Programación Multimedia y de Dispositivos Móviles
 * curso 2020|21
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.ajsb.test_room.database.Database;
import com.ajsb.test_room.database.entidades.Tarea;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Database db = Database.getDatabase(this) ;
        Log.i("TDLIST", "Base de datos creada") ;

        db.getDao().insertTask(new Tarea("Estudiar Android", "01-01-2021")) ;
        Log.i("TDLIST", "Insertamos una tarea") ;

        db.getDao().insertTask(new Tarea("Estudiar Acceso a Datos", "01-01-2021")) ;
        Log.i("TDLIST", "Insertamos otra tarea") ;

        db.getDao().insertTask(new Tarea("Comprar macarrones", "01-01-2021")) ;
        Log.i("TDLIST", "Insertamos una tercera tarea") ;

        List<Tarea> tareas = db.getDao().getAllTasks() ;
        Log.i("TDLIST", "Tareas: " + tareas) ;

    }
}