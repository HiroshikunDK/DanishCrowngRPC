package org.example.data.Persistence;
import java.sql.*;

public interface DataMapper<T> {
    T create(ResultSet rs) throws SQLException;
}
