package com.example.grandapp;

public class medicamentoXusuarios {
        private int IdUsuario;
    private int IdMeds;
        private String fechaInicio;
    private String horaInicio;
    private int repeticion;
    private  int repeticionAlerta;
    public int getId() {
            return IdUsuario;
        }

        public void setId(int idUsuario) {
            IdUsuario = idUsuario;
        }
    public int getId() {
        return IdMeds;
    }

    public void setId(int idMeds) {
        IdMeds = idMeds;
    }

        public String getFechaInicio() {
            return fechaInicio;
        }

        public void setFechaInicio(String FechaInicio) {
            fechaInicio= FechaInicio;
        }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String HoraInicio) {
        horaInicio= HoraInicio;
    }

        public int getRepeticion() {
            return repeticion;
        }

        public void setRepeticion(int Repeticion) {
            repeticion = Repeticion;
        }
    public int getRepeticionAlerta() {
        return repeticionAlerta;
    }

    public void setRepeticionAlerta(int RepeticionAl) {
        repeticionAlerta = RepeticionAl;
    }
    }
}
