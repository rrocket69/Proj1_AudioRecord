package sqlconnect;

import controller.Factory;
import entities.Styles;
import model.Disc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/audiorecorddb" +
            "?verifyServerCertificate=false" +
            "&useSSL=false" +
            "&requireSSL=false" +
            "&useLegacyDatetimeCode=false" +
            "&amp" +
            "&serverTimezone=UTC";

    private static final String USER = "root";
    private static final String PASSWORD = "****Put your password****";

    public Disc getRecordsFromDB(Disc disc){
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from music_comp");;

            while (resultSet.next()){
                disc.addSong(Factory.createOne(
                        resultSet.getString("type"),
                        resultSet.getString("name"),
                        Styles.valueOf(resultSet.getString("style")),
                        resultSet.getString("author"),
                        resultSet.getInt("duration")));
            }

            // Used to add records to database, first created table
//            statement.execute("INSERT INTO music_comp(name,type,author,duration,style)VALUES ('Hey Jude','Song','The Beatles',200000,'Rock');");
//            statement.execute("INSERT INTO music_comp(name,type,author,duration,style)VALUES ('Ghost of opera','Opera','Webber',500000,'Classical');");
//            statement.execute("INSERT INTO music_comp(name,type,author,duration,style)VALUES ('Yo','Track','Noname',199999,'HipHop');");
//            statement.execute("INSERT INTO music_comp(name,type,author,duration,style)VALUES ('6th','Symphony','Mozart',400001,'Classical');");
//            statement.execute("INSERT INTO music_comp(name,type,author,duration,style)VALUES ('What a wonderful world','Song','Lui Armstrong',200001,'Jazz');");


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return disc;
    }
}
