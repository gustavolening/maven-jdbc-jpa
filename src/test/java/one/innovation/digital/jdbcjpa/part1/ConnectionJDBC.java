package one.innovation.digital.jdbcjpa.part1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args){
        // 1 - não esquecer de baixar o driver para o banco de dados que irá utilizar, da para baixar a depencia diretamente quando está criando o projeto
        // maven / gradle
        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";

        try(Connection conn = DriverManager.getConnection(urlConnection, "root", "Lenning1@")){
            System.out.println("Sucesso ao conectar!");
        }catch (Exception e){
            System.out.println("Falha ao conectar!");
        }


    }
}
