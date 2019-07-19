package com.swagqueen.lulloo.newdesign.staticjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.swagqueen.lulloo.newdesign.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView gameRecyclerView;
    private GameAdapter gameAdapter;


    List<Game> gamesArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameRecyclerView = findViewById(R.id.gameRecyclerView);

        gameRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));

        gameRecyclerView.setItemAnimator(new DefaultItemAnimator());
        gameAdapter = new GameAdapter(MainActivity.this, null);
        gameRecyclerView.setAdapter(gameAdapter);



        getJsonFileFromLocally();
    }



    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = MainActivity.this.getAssets().open("infodemo.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    private void getJsonFileFromLocally() {
        try {
            JSONObject obj = new JSONObject(loadJSONFromAsset());
            String responseCode = obj.getString("responseCode");
            String responseMessage = obj.getString("responseMessage");
            Log.e("keshav", "responseCode -->" + responseCode);
            Log.e("keshav", "responseMessage -->" + responseMessage);

            JSONArray m_jArry = obj.getJSONArray("StudentList");
            Log.e("keshav", "m_jArry -->" + m_jArry.length());

            gamesArrayList = new ArrayList<>();

            for (int i = 0; i < m_jArry.length(); i++) {
                Game game = new Game();
                JSONObject jo_inside = m_jArry.getJSONObject(i);             //  todo ValueInt

                Integer id = jo_inside.getInt("id");
                String name = jo_inside.getString("name");
                String iconURL = jo_inside.getString("Father name");
                String link = jo_inside.getString("fees");

                if(i==0) {
                    Log.e("keshav", "id -->" + id);
                    Log.e("keshav", "name -->" + name);
                    Log.e("keshav", "Father -->" + iconURL);
                    Log.e("keshav", "feees  -->" + link);
                }
                game.setId(id);
                game.setName(""+name);
                game.setIconURL(""+iconURL);
                game.setLink(""+link);
                gamesArrayList.add(game);
            }       // for
            if(gamesArrayList!=null) {
                gameAdapter.dataChanged(gamesArrayList);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
