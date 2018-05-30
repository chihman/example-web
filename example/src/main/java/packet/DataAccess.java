package packet;

import java.util.ArrayList;

/**
 * Created by pro-31 on 30.05.2018.
 */
public class DataAccess {

    public ArrayList<String> LoadList() throws ClassNotFoundException {


        Class.forName("org.postgresql.Driver");


    }
}
