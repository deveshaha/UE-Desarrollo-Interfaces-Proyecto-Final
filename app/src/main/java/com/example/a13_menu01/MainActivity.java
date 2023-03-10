package com.example.a13_menu01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    /*
    En este ejemplo vamos a ver como podemos trabajar con un menu de
    opciones en android

    En primer lugar, debes ubicar crear un archivo de menú y ubicarlo en la carpeta
    res/menu/nombre_archivo.xml.

    Desde Android Studio se resume a dar click derecho en tu carpeta res y luego seleccionar
    New > Android Resource File.

    Al desplegarse la ventana de configuración, selecciona "Menu" en el tipo de recursos y
    luego ponemos su nombre "main_menu"

    Podemos crear los dibujos en New > Vector Asset en la carpeta de drawable
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Este metodo se llamara cuando se cree la actividad e inflaremos el menu
    //El parametro menu sera el objeto donde inflaremos el layout, que nos lo
    //crea android

    //En el valor de retorno decimos si queremos mostrar el menu o no
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    //Con este método detectaremos que opción del menú ha sido pulsada
    //el parametro MenuItem representa el objeto que fue seleccionado, no puede ser null
    //En el valor de retorno decimos si queremos procesar el elemento en este metodo o no
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.edit_action) {
            String texto = "Ha pulsado" + item.getTitle().toString();
            Toast.makeText(this,texto,Toast.LENGTH_SHORT).show();
            return true;
        } else if(id == R.id.modo_nocturno){
            Toast.makeText(this,"Modo nocturno Pulsado!",Toast.LENGTH_SHORT).show();
            item.setChecked(!item.isChecked());
            if (item.isChecked()) {
                Toast.makeText(this, "Modo nocturno activado!", Toast.LENGTH_SHORT).show();
                //change background color to black
                View view = this.getWindow().getDecorView();
                view.setBackgroundColor(Color.BLACK);
            } else{
                Toast.makeText(this,"Modo nocturno desactivado!",Toast.LENGTH_SHORT).show();
                //change background color to white
                View view = this.getWindow().getDecorView();
                view.setBackgroundColor(Color.WHITE);
            }
            return true;
        } else if(id == R.id.share_action){
            Toast.makeText(this,"Compartir Pulsado!",Toast.LENGTH_SHORT).show();
            return true;
        } else if(id == R.id.delete_action){
            Toast.makeText(this,"Eliminar Pulsado!",Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.create_pdf_action) {
            Toast.makeText(this,"Crear PDF Pulsado!",Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.print_action){
            Toast.makeText(this,"Imprimir Pulsado!",Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.send_action){
            Toast.makeText(this,"Enviar Pulsado!",Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.op1){
            Toast.makeText(this,"Opción 1 Pulsado!",Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.op2){
            Toast.makeText(this,"Opción 2 Pulsado!",Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.op3){
            Toast.makeText(this,"Opción 3 Pulsado!",Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.op4){
            Toast.makeText(this,"Opción 4 Pulsado!",Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}