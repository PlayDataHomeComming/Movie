package repository;


import Connection.Connection;

//디비 접근하는 친구
public class Repository {

    public void insertUsers(String name){
        Connection conn = new JdbcConnection().getJdbc();
        String sql = "insert into people( name)\n" +
                "values (?)";



}