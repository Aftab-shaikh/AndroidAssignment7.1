package com.example.user1.assignment71;

/*

This Project is basically Explain about implicit Intent.
In this project User will search in the search bar and can view the result in the diffrent browser.
 */


// All required call Imported.
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


// class Start from here.

// below is the main Activity.
public class MainActivity extends AppCompatActivity {

    // here is some private refernce for SearchBar and Button.
    private EditText searchbar;
    private Button searchButton;

    @Override
    // Ocreat Method which works as main Method.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // this is how we can assinged Id's to Widgets refrence.
        searchbar= (EditText) findViewById(R.id.searchbar);
        searchButton= (Button) findViewById(R.id.searchbutton);


         // set Onclick Listner to button // View.OnClickListener is a interface.
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Input from user will get by gettext().toString method and get stored in String Variable (result)

                String result= searchbar.getText().toString();

                // Uri class is use for URL data will write in parse method.

                Uri uri= Uri.parse("http://www.google.com/#q= " + (result));

                // here is Intent to perfom the action with uri data.

                Intent i=new Intent(Intent.ACTION_VIEW,uri);

                // start activity method to start Intent.
                startActivity(i);


            }
        });

    }

}// class closed
