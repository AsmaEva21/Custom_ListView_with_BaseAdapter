package com.asmaeva.custom_listview_with_baseadapterassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView list;
    //ImageView icon1;
    String[] title  = {
            "Rana Plaza tragedy: Justice delayed for 11 years",
            "2 CUET students killed in road crash",
            "Heat wave in Rajshahi:Cool drinks distributed ",
            "Hilsha prices skyrocket ahead of Pahela Baishakh",
            "HC orders Salam Murshedy to hand over Gulshan house to govt",
            "Upazila Parishad elections: 25 candidates win uncontested",
            "EU urges donors to fund UN agency for Palestinians after review",
            "Bellingham brings Madrid to brink of title with Clasico winner"};
    String[] location = {"Dhaka", "Chattogram", "Rajshahi", "Barishal", "Khulna", "Dhaka", "Brussels, Belgium ", "Santiago Bernabeu stadium in Madrid"};
    String[] description = {
            "The trial is yet to be completed in 11 years in the murder case filed over the tragic Rana Plaza building collapse that took place in Savar, outskirts of capital Dhaka, on 24 April 2013, killing 1,135 people. To date, the deposition of 84 out of 594 witnesses has been recorded, and now victim workers and their families raise questions about the sincerity of the prosecution.\n" +
                    "\n" +
                    "Dhaka district and session judge court’s additional public prosecutor Bimal Samadder told Prothom Alo the recording of witness deposition had remained stalled for long due to the High Court’s stay order in favour of several accused, but the recording of witness deposition has been continuing for over a year on a regular basis.",


            "Two students of the civil engineering department at the Chittagong University of Engineering and Technology (CUET) were killed after a bus ran over them.\n" +
                    "\n" +
                    "According to the locals and witnesses, the accident occurred at around 3:30 pm on Monday in the Zianagar area under the Rangunia police station of Chattogram.\n" +
                    "\n" +
                    "The deceased were identified as Shanto Saha, third-year-student of civil engineering department and Towfik Hossain, second-year-student from the same department.\n" +
                    "\n" +
                    "Apart from them, Zakaria Himu, a second-year-student of the department was critically injured in the accident. He has been undergoing treatment at the Evercare Hospital in the port city.",


            "Public life has been disrupted by the protracted heat wave in Rajshahi as people are sweating profusely with high humidity in the air and scorching heat. \n" +
                    "\n" +
                    "Rickshaw-pullers and other workers are wearing caps, gamchhas (cotton scarfs) to ward off the direct sun, and drinking plenty of water.\n" +
                    "\n" +
                    "Voluntary organisations are offering some relief from the heat by distributing juice (sharbat), water and oral saline solutions among the people on the streets.\n" +
                    "\n" +
                    "At around 1:00pm Sunday afternoon, an organisation called The Smiling Foundation distributed juice among over 200 people on the streets at Shaheb Bazar Zero Point and Lakshmipur in Rajshahi city. Earlier, another organisation 'Rajshahi Manobik Foundation' distributed water and oral saline drinks at the Alupatti intersection of the city.",

            "The country will be celebrating Bengali new year Pahela Baishakh just two days after the holy Eid-ul-Fitr. The demand of hilsha has risen centring the two festivals back to back. However, there are not enough hilsha fishes in the rivers at the moment. As a result, supply has fallen and hilsha prices are skyrocketing in both retail and wholesale markets.\n" +
                    "\n" +
                    "Visiting different markets in Barishal and Barguna it has been learnt that the sellers asking Tk 3,000 to Tk 6,000 per piece hilsha weighing over 1 kg. And the price of 500gm-hilsha fishes now stands at Tk 1,200 per kg, which was Tk 800 a few days ago.\n" +
                    "\n" +
                    "Hilsha prices have also gone up in the wholesale market. The price per mound of hilsha fish has reached Tk 100,000. Even the price of per mound small sized hilsha fish has crossed Tk 50,000 at the hilsha port in the Barishal city.",

            "The High Court on Tuesday ordered Khulna-4 constituency MP and vice president of Bangladesh Football Federation (BFF), Abdus Salam Murshedy, to hand over the house he has been staying in Gulshan in the capital city to the Housing and Public Works Ministry.\n" +
                    "\n" +
                    "The HC bench of justice Md Nazrul Islam Talukder and justice Kazi Ebadoth Hossain passed the order. The court asked Murshedy to complete the process within three months after receiving the copy of the verdict.\n" +
                    "\n" +
                    "\n" +
                    "The court also said that the house in Gulshan is an abandoned property of the government.\n" +
                    "\n" +
                    "Senior advocate Mohammad Syed Ahmed represented Murshedy while senior advocate Khurshid Alam Khan stood for the Anti-Corruption Commission (ACC) and deputy attorney general Saifuddin Khaled represented the state. Advocate Anik R Haque represented the petitioner.\n" +
                    "\n" +
                    "Murshedy’s lawyer Syed Ahmed said they will file an appeal petition challenging the verdict.\n" +
                    "\n",

            "A total of 25 candidates, including six chairmen, have emerged victorious uncontested in the first phase of upazila parishad elections, though more than two weeks are still left before the voting.\n" +
                    "\n" +
                    "According to the election commission sources, six chairmen, nine vice-chairmen, and 10 female vice-chairmen have won in the elections that are scheduled to take place on 8 May.\n" +
                    "\n" +
                    "\n" +
                    "The elections into upazilas will be held in four phases, while the first phase is slated for 8 May. \n" +
                    "\n" +
                    "All the chairmen, vice-chairmen, and female vice-chairmen in Bagerhat sadar, Munshiganj sadar, Shibchar in Madaripur, and Parshuram in Feni have won the elections uncontested. \n" +
                    "\n" +
                    "Apart from them, the chairmen of Saghata upazila parishad in Gaibandha and Singra upazila parishad in Natore secured unopposed victory before the polling.\n" +
                    "\n" +
                    "\n" +
                    "Also Read\n" +
                    "Upazila parishad: Relatives of ministers, MPs asked not to contest in polls\n" +
                    "Upazila parishad: Relatives of ministers, MPs asked not to contest in polls\n" +
                    "The chairman of Rowangchhari upazila parishad also won uncontested, but the election commission postponed polls for the upazila. \n" +
                    "\n" +
                    "The vice chairman and female vice chairman of Baliadangi upazila parishad in Thakurgaon and Damurhuda in Chuadanga have been elected unopposed.",

            "The EU's humanitarian chief and key donor Norway on Tuesday urged countries to fund the UN agency for Palestinians after a review said Israel had not yet provided evidence that hundreds of staff had helped militants.\n" +
                    "\n" +
                    "European commissioner for crisis management Janez Lenarcic welcomed the report for \"underlining the agency's significant number of compliance systems in place as well as recommendations for their further upgrade.\"\n" +
                    "\n" +
                    "\"I call on the donors to support UNRWA - the Palestinian refugees' lifeline,\" he wrote on X, the former Twitter.\n" +
                    "\n" +
                    "Several countries suspended payments to the UN Relief and Works Agency after Israel alleged in January that some of its staff may have taken part in or helped the Hamas 7 October attacks on Israel. Some have since Resumed aid however.\n" +
                    "\n" +
                    "\"I am very pleased that countries like Australia, Canada, Finland, Germany, Iceland, Japan and Sweden have already reversed their decisions and resumed funding to UNRWA,\" Norway's foreign minister Espen Barth Eide said in a statement.\n" +
                    "\n" +
                    "\"I would now like to call on countries that have still frozen their contributions to UNRWA to resume funding,\" added Eide, whose country heads an international aid group for Palestinians, the Ad Hoc Liaison Committee and is one of its key funders.\n" +
                    "\n" +
                    "\n" +
                    "The calls came after an independent review on UNRWA activities said Monday it had found some \"neutrality-related issues\" but noted that \"Israel has yet to provide supporting evidence\" for its claim that UNRWA employs more than 400 \"terrorists.\"\n" +
                    "\n" +
                    "The review group was created following Israel's allegations. In the weeks that followed, donor states suspended or paused some $450 million in funding.",

            "Jude Bellingham snatched Real Madrid a dramatic 3-2 Clasico win over champions Barcelona on Sunday with a \"fundamental\" goal to take them 11 points clear at the top of La Liga.\n" +
                    "\n" +
                    "Real Madrid coach Carlo Ancelotti hailed the England midfielder's decisive intervention to take Los Blancos to the brink of the Spanish title.\n" +
                    "\n" +
                    "Madrid twice came from behind with Vinicius Junior and Lucas Vazquez netting to level Andreas Christensen and Fermin Lopez strikes, before Bellingham rammed home the winner in stoppage time.\n" +
                    "\n" +
                    "\"He arrived at just the right time, he worked so hard in the game, it's been a while since he scored and today he scored a goal that could be fundamental in winning the league,\" said Ancelotti.\n" +
                    "\n" +
                    "Barcelona, second, bounced back with a strong performance after their Champions League exit at the hands of Paris Saint-Germain but their last stand was demolished by Bellingham.\n" +
                    "\n" +
                    "Madrid showed the same grit to stay in the match as they did midweek against Manchester City on the way to the final four in Europe, before Bellingham's knock-out blow left the Santiago Bernabeu crowd delighted.\n" +
                    "\n" +
                    "\n" +
                    "Madrid's top scorer with 21 goals across all competitions, the former Borussia Dortmund man netted twice in Madrid's Clasico win over Barcelona in October and is shining in his first season in Spain at only 20 years old."};
    Integer[] imageId = {R.drawable.img_5, R.drawable.img_6, R.drawable.img_7, R.drawable.img_8, R.drawable.img_9, R.drawable.img_10, R.drawable.img_11, R.drawable.img_12};
    String[] timedate = {"Published: 24 Apr 2024, 11:27","Published: 22 Apr 2024, 21:20", "Published: 21 Apr 2024, 18:37", "Published: 11 Apr 2024, 14:30", "Published: 19 Mar 2024, 16:37", "Published: 23 Apr 2024, 21:53", "Published: 24 Apr 2024, 09:00", "Published: 22 Apr 2024, 08:18"};

    //Integer[] icon = {R.drawable.img_13};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


     /* ImageView iconImageView = findViewById(R.id.icon); // Retrieve the ImageView
        iconImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // When ImageView is clicked, start MainActivity2 and pass the image resource ID
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("imageResource", R.drawable.img_13);
                startActivity(intent);
            }
        });*/
        list = findViewById(R.id.list);

        CustomAdapter listAdapter = new CustomAdapter(MainActivity.this, title , location, description, timedate, imageId);
        list.setAdapter(listAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("title ", title [position]);
                intent.putExtra("location", location[position]);
                intent.putExtra("description", description[position]);
                intent.putExtra("timedate", timedate[position]);
                intent.putExtra("imageId", imageId[position]);

                startActivity(intent);
            }
        });
    }
}

