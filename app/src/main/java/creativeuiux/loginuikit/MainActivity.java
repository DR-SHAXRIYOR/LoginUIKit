package creativeuiux.loginuikit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.LoginListAdapter;
import modalclass.ModalClass;

public class MainActivity extends AppCompatActivity {


    private ArrayList<ModalClass> modalClasses;

    private RecyclerView recyclerView;
    private LoginListAdapter mAdapter;

    private String Name[] = {"1. Login 1 Activity ",
            "2. Login 2 Activity ",
            "3. Login 3 Activity ",
            "4. Login 4 Activity",
            "5. Login 5 Activity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //use recycleview
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        //use arraylist
        modalClasses = new ArrayList<>();
                for (int i = 0; i < Name.length; i++) {
            ModalClass navigationList_modalClass = new ModalClass(Name[i]);

            modalClasses.add(navigationList_modalClass);
        }

        // Use of  Login List Adapter
        mAdapter = new LoginListAdapter(MainActivity.this,modalClasses);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }

}
