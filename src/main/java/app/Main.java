package app;

import Util.JsonIO;
import model.Biblioteca;
import model.Cliente;
import model.Usuario;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    private static final Path RUTA = Paths.get("data", "biblioteca.json");

    public static void main(String[] args) {

        try{
            // Exportacion
            File json = RUTA.toFile(); // Convertimos RUTA en objeto File
            if(!json.exists()){
                // Primera vez que se ejecuta no va a existir.
                // Necesitamos una biblioteca creada
                Biblioteca biblio = cargaDatos();

                JsonIO.write(json,biblio);
                System.out.println("Exportado con exito a: "+json.getAbsolutePath());
            }

        }catch(Exception e){
            System.err.println("Error ejecutando la app: "+e.getMessage());;

        }


    }

    private static Biblioteca cargaDatos(){
        Biblioteca b = new Biblioteca("Biblioteca Cher");
        List<Usuario> usuarios = List.of(
                new Usuario(1,"Cher Rodriguez", "Cher@hotmail.com", true),
                new Usuario(2,"Paco Rodriguez", "Cher@hotmail.com", true),
                new Usuario(3,"David Rodriguez", "Cher@hotmail.com", true)
        );
        List<Cliente> clientes = List.of(
                new Cliente(1,"Cher Rodriguez", "666666666", 0.12),
                new Cliente(2,"Paco Rodriguez", "666666666", 12.0),
                new Cliente(3,"David Rodriguez", "666666666", 100.0)
        );

        b.setUsuarios(usuarios);
        b.setClientes(clientes);

        return b;
    }
}
