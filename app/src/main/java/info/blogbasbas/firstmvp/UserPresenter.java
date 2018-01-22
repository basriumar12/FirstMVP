package info.blogbasbas.firstmvp;

import android.widget.EditText;

import java.util.ArrayList;

import info.blogbasbas.firstmvp.model.User;

/**
 * Created by User on 22/01/2018.
 */


//TODO 2 : create presenter
public class UserPresenter implements PresenterImp{

    Userview model ;
    ArrayList<User> data ;

    public UserPresenter(Userview model) {
        this.model = model;
        data = new ArrayList<>();
    }


    @Override
    public void input(EditText name , EditText email){

        //get inputan user
        String input1 = name.getText().toString();
        String input2 = email.getText().toString();

        //check inputan user
        if(input1.isEmpty() || input2.isEmpty()){
            model.Error("TIDAK BOLEH KOSONG");

        }
        else{
         //   ArrayList<User> data = new ArrayList<>();
            User user = new User();
            user.setNama(input1);
            user.setEmail(input2);

            data.add(user);

            //pindahin ke interface
           // model.DataInsert(data);


        }









    }

    public void ambil(){

        model.DataInsert(data);

    }

    @Override
    public void input2(String nn) {

    }


}
