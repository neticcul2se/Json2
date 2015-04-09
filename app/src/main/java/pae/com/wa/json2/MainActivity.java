package pae.com.wa.json2;
import org.json.JSONObject;
import android.os.Bundle;
import android.app.Activity;

import android.widget.TextView;

public class MainActivity extends Activity {


     String js = "{\"name\": \"wachira\"}";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt1=(TextView)findViewById(R.id.tv1);

        try {
            JSONObject jsob = new JSONObject(js);
            String myname = jsob.getString("name");
            txt1.setText(myname);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }







//public class MainActivity extends Activity {
//
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // listView1
//        final ListView lisView1 = (ListView)findViewById(R.id.listView1);
//
//        /*** Sample JSON Code ***'
//         [{
//         "MemberID":"1",
//         "Name":"Weerachai",
//         "Tel":"0819876107"
//         },
//         {
//         "MemberID":"2",
//         "Name":"Win",
//         "Tel":"021978032"
//         },
//         {
//         "MemberID":"3",
//         "Name":"Eak",
//         "Tel":"0876543210"
//         }]
//         */
//
//        String strJSON = "[{\"MemberID\":\"1\",\"Name\":\"Weerachai\",\"Tel\":\"0819876107\"}" +
//                ",{\"MemberID\":\"2\",\"Name\":\"Win\",\"Tel\":\"021978032\"}" +
//                ",{\"MemberID\":\"3\",\"Name\":\"Eak\",\"Tel\":\"0876543210\"}]";
//
//        try {
//            JSONArray data = new JSONArray(strJSON);
//
//            ArrayList<HashMap<String, String>> MyArrList = new ArrayList<HashMap<String, String>>();
//            HashMap<String, String> map;
//
//            for(int i = 0; i < data.length(); i++){
//                JSONObject c = data.getJSONObject(i);
//
//                map = new HashMap<String, String>();
//                map.put("MemberID", c.getString("MemberID"));
//                map.put("Name", c.getString("Name"));
//                map.put("Tel", c.getString("Tel"));
//                MyArrList.add(map);
//
//            }
//
//
//            SimpleAdapter sAdap;
//            sAdap = new SimpleAdapter(MainActivity.this, MyArrList, R.layout.activity_column,
//                    new String[] {"MemberID", "Name", "Tel"}, new int[] {R.id.ColMemberID, R.id.ColName, R.id.ColTel});
//            lisView1.setAdapter(sAdap);
//
//        } catch (JSONException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//    }
//
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }
//
//}