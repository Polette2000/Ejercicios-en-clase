package model;



import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Fiesta {

    private int idFiesta;
    private String nombre;
    private String tipo;
    ///private Date fecha;
    private String ubicacion;
    private int capacidad;
    private Date fecha;




}
