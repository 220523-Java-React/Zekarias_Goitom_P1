package com.revature.repository.util;

import com.revature.util.ConnectionUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtilityTest {
    @Test
    public void whenGivenValidCredentialsGetConnectionReturnsValidConnection() throws SQLException {
        Connection connection = ConnectionUtility.getConnection();

        Assertions.assertNotNull(connection);
    }

    @Test
    public void whenLoadPropertiesIsCalledLoadsValidProperties(){
        String url="jdbc:postgresql://localhost:5432/postgres?currentSchema=Zekarias_Goitom_P1";
        String user="postgres";
        String password="1234";
        Properties properties = ConnectionUtility.loadProperties();

        Assertions.assertEquals(url, properties.getProperty("url"));
        Assertions.assertEquals(user, properties.getProperty("user"));
        Assertions.assertEquals(password, properties.getProperty("password"));

    }

}
