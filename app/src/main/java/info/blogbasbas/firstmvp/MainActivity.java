package info.blogbasbas.firstmvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import info.blogbasbas.firstmvp.model.User;

public class MainActivity extends AppCompatActivity implements Userview {



    @BindView(R.id.edtusername)
    EditText edtusername;
    @BindView(R.id.edtEmail)
    EditText edtEmail;
    @BindView(R.id.btnSubmit)
    Button btnSubmit;
    @BindView(R.id.listview)
    ListView listview;

    UserPresenter presenter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new UserPresenter(this);


    }

    @OnClick(R.id.btnSubmit)
    public void onViewClicked() {
        presenter.input(edtusername,edtEmail);
    }

    @Override
    public void DataInsert(ArrayList<User> data) {
        //create adapter
        Toast.makeText(this,String.valueOf(data.size()) , Toast.LENGTH_SHORT).show();

    }

    @Override
    public void Error(String error) {

        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();

    }
}
