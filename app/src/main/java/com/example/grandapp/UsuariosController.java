package com.example.grandapp;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UsuariosController {
    private class TareaAsincronicaUsuarios extends Usuarios <Void, Void, String> {

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                URL miRuta = new URL("localHost:1433/getIdUsuario");
                HttpURLConnection miConexion = (HttpURLConnection) miRuta.openConnection();
                if (miConexion.getResponseCode() == 200) {
                    Log.d("PresionoBoton", "se creo una URL" + miConexion.getResponseCode());
                    InputStream cuerpoRespuesta = miConexion.getInputStream();
                    InputStreamReader respLeidaCategorias = new InputStreamReader(cuerpoRespuesta, "UTF-8");
                    ProcesarJsonLeidoCategorias(respLeidaCategorias);
                } else {
                    Log.d("PresionoBoton", "no se creo una URL");

                }
                miConexion.disconnect();
            } catch (Exception error) {

                Log.d("PresionoBoton", "no se creo una URL" + error.getMessage());
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            datosCategoria.setAdapter(miAdaptador);
            datosCategoria.setOnItemClickListener(listener);
            Log.d("postExecute", "onpost eexecute bien");
        }

    }


    public void ProcesarJsonLeidoCategorias(InputStreamReader respLeidaCategorias) {
        JsonParser ProcesadorDeJson;
        ProcesadorDeJson = new JsonParser();
        JsonObject objetoJson;
        objetoJson = ProcesadorDeJson.parse(respLeidaCategorias).getAsJsonObject();

        ArrCategorias = objetoJson.get("categorias").getAsJsonArray();
        Log.d("jsonobject", "categoriaparseada" + ArrCategorias);
        cargarLista(ArrCategorias);

    }

}
