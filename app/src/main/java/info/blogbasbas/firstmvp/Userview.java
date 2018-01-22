package info.blogbasbas.firstmvp;

import java.util.ArrayList;

import info.blogbasbas.firstmvp.model.User;

/**
 * Created by User on 22/01/2018.
 */

public interface Userview {

    void    DataInsert(ArrayList<User> data);

    void Error(String error);

}
