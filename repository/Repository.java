package repository;

import Connection.JdbcConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//디비 접근하는 친구
public class Repository {

    public void insertUsers(String name){
        Connection conn = new JdbcConnection().getJdbc();
        String sql = "insert into people( name)\n" +
                "values (?)";

        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1, name);
            if(psmt.executeUpdate() == 0){
                System.out.println("insertUsers err");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("connection close fail");
        }
    }




}


