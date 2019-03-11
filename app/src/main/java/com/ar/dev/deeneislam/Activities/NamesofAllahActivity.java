package com.ar.dev.deeneislam.Activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;

import com.ar.dev.deeneislam.Adapter.AllahNamesAdapter;
import com.ar.dev.deeneislam.R;

public class NamesofAllahActivity extends AppCompatActivity {

    private String[] NAMES = {"ALLAH", "Ar Rahman", "Ar Raheem", "Al Malik", "Al Quddus", "As Salam", "Al Mu'min", "Al Muhaymin", "Al Aziz", "Al Jabbaar"
            , "Al Mutakabbir", "Al Khaaliq", "Al Baari", "Al Musawwir", "Al Ghaffaar", "Al Qahhaar", "Al Wahhaab", "Ar Razzaaq", "Al Fattaah", "Al Alim"
            , "Al Qaabidh", "Al Baasit", "Al Khaafidh", "Ar Raafi'", "Al Mu'izz", "Al Muzil", "As Sami'", "Al Basir", "Al Hakam", "Al 'Adl", "Al Latif"
            , "Al Khabir", "Al Halim", "Al-‘Adheem", "Al Ghafur", "Ash Shakur", "Al Ali", "Al Kabir", "Al Hafidh", "Al Muqit", "Al Hasib", "Al Jalil"
            , "Al Karim", "Ar Raqib", "Al Mujib", "Al Wasi'", "Al Hakim", "Al Wadud", "Al Majid", "Al Ba'ith", "Ash Shaheed", "Al Haqq", "Al Wakil", "Al Qawiyy"
            , "Al Mateen", "Al Wali", "Al Hamidu", "Al Muhsi", "Al Mubdi", "Al Mu'id", "Al Muhyi", "Al Mumit", "Al Hayy", "Al Qayyum", "Al Waajid"
            , "Al Maajid", "Al Waahid", "Al Ahad", "As Samad", "Al Qaadir", "Al Muqtadir", "Al Muqaddim", "Al Mu'akhkhir", "Al Awwal", "Al Aakhir"
            , "Az Dhaahir", "Al Baatin", "Al Waali", "Al Muta'ali", "Al Barr", "At Tawwaab", "Al Muntaqim", "Al 'Afuww", "Ar Ra'uf", "Malik Al Mulk"
            , "Dhual Jalal wa Al Ikram", "Al Muqsit", "Al Jaami'", "Al Ghani", "Al Mughni", "Al Mani'", "Ad Dharr", "An Nafi'", "An Nur", "Al Hadi", "Al Badi'i"
            , "Al Baaqi", "Al Waarith", "Ar Rashid", "Al Saboor"};

    private String[] DESCRIPTION = {"The Greatest Name", "The Most Gracious", "The Most Merciful", "The King", "The Most Holy", "The Ultimate Provider of Peace",
            "The Guardian of Faith", "The Guardian, the Preserver", "The Almighty, the Self Sufficient", "The Compeller", "The Dominant one", "The Creator"
            , "The Maker", "The Fashioner of Forms", "The Ever-Forgiving", "The All Subduer", "The Bestower", "The Ever-Providing, The Sustainer", "The Ultimate Judge, The Opener of All Portals, the Victory Giver"
            , "The All-Knowing, the Omniscient", "The Restrainer, the Straightener", "The Expander, the Munificent", "The Abaser, The Demeanor", "The Exalter", "The Giver of Honour", "The Giver of Dishonor"
            , "The All-Hearing", "The All-Seeing", "The Judge, the Ultimate Arbiter", "The Utterly Just", "The Kind", "The All-Aware", "The Forbearer, The Indulgent"
            , "The Magnificent, the Infinite", "The All-Forgiving", "The Grateful", "The Sublimely Exalted", "The Great", "The Preserver, The Protector", "The Nourisher"
            , "The Reckoner", "The Majestic", "The Bountiful, the Generous", "The Watchful", "The Responsive, the Answerer", "The Vast, the All Encompassing", "The Wise"
            , "The Loving, the Kind One", "The All Glorious", "The Raiser of the Dead", "The Witness", "The Truth, the Real", "The Trustee, the Dependable", "The Strong"
            , "The Firm, the Steadfast", "The Protecting Friend, Patron, and Supporter", "The All Praise Worthy", "The Accounter, The Numberer of All", "The Producer, Originator, and Initiator of all"
            , "The Reinstater Who Brings Back All", "The Giver of Life", "The Bringer of Death, the Destroyer", "The Ever Living",
            "The Self Subsisting Sustainer of All", "The Perceiver, the Finder, the Unfailing", "The Illustrious, the Magnificent", "The One, the All Inclusive, the Indivisible"
            , "The One, the Indivisible", "The Everlasting,The Eternal Refuge", "The All-Capable, The Most Able, The Most Powerful", "The All Determiner, the Dominant"
            , "The Expediter, He who brings forward", "The Delayer, He who brings backwards", "The First", "The Last", "The Manifest; the All Victorious"
            , "The Hidden; the All Encompassing", "The Patron", "The Self Exalted", "The Most Kind and Righteous", "The Ever-Pardoning, Ever Relenting", "The Avenger"
            , "The Pardoner, The Forgiver", "The Clement, The Compassionate, The All-Pitying", "The Owner of All Sovereignty", "The Lord of Majesty and Generosity"
            , "The Equitable, the Requiter", "The Gatherer, the Unifier", "The All Rich, the Independent", "The Enricher, the Emancipator", "The Withholder, the Shielder, the Defender"
            , "The Distresser", "The Propitious, the Benefactor", "The Light", "The Guide", "Incomparable, the Originator", "The Ever Enduring and Immutable", "The Heir, the Inheritor of All"
            , "The Guide, Infallible Teacher, and Knower", "The Forbearing, The Patient"};

    public int[] IMAGES = {R.drawable.zero, R.drawable.one, R.drawable.two, R.drawable.three
            , R.drawable.four, R.drawable.five, R.drawable.six, R.drawable.seven,
            R.drawable.eight, R.drawable.nine, R.drawable.ten, R.drawable.eleven,
            R.drawable.twelve, R.drawable.thirteen, R.drawable.fourteen, R.drawable.fifteen,
            R.drawable.sixteen, R.drawable.seventeen, R.drawable.eighteen, R.drawable.nineteen,
            R.drawable.twenty, R.drawable.twentyone, R.drawable.twentytwo, R.drawable.twentythree, R.drawable.twentyfour,
            R.drawable.twentyfive, R.drawable.twentysix, R.drawable.twentyseven, R.drawable.twentyeight, R.drawable.twentynine, R.drawable.thirty
            , R.drawable.thirtyone, R.drawable.thirtytwo, R.drawable.thirtythree, R.drawable.thirtyfour, R.drawable.thirtyfive,
            R.drawable.thirtysix, R.drawable.thirtyseven, R.drawable.thirtyeight, R.drawable.thirtynine, R.drawable.forty
            , R.drawable.fortyone, R.drawable.fortytwo, R.drawable.fortythree, R.drawable.fortyfour
            , R.drawable.fortyfive, R.drawable.fortysix, R.drawable.fortyseven, R.drawable.fortyeight, R.drawable.fortynine, R.drawable.fifty
            , R.drawable.fifty1, R.drawable.fifty2, R.drawable.fifty3, R.drawable.fifty4, R.drawable.fifty5, R.drawable.fifty6
            , R.drawable.fifty7, R.drawable.fifty8, R.drawable.fifty9, R.drawable.sixty, R.drawable.sixty1, R.drawable.sixty2
            , R.drawable.sixty3, R.drawable.sixty4, R.drawable.sixty5, R.drawable.sixty6, R.drawable.sixty7, R.drawable.sixty8, R.drawable.sixty9
            , R.drawable.seventy, R.drawable.seventy1, R.drawable.seventy2, R.drawable.seventy3, R.drawable.seventy4
            , R.drawable.seventy5, R.drawable.seventy6, R.drawable.seventy7, R.drawable.seventy8, R.drawable.seventy9, R.drawable.eighty
            , R.drawable.eighty1, R.drawable.eighty2, R.drawable.eighty3, R.drawable.eighty4, R.drawable.eighty5, R.drawable.eighty6
            , R.drawable.eighty7, R.drawable.eighty8, R.drawable.eighty9, R.drawable.ninety, R.drawable.ninety1, R.drawable.ninety2
            , R.drawable.ninety3, R.drawable.ninety4, R.drawable.ninety5, R.drawable.ninety6, R.drawable.ninety7
            , R.drawable.ninety8, R.drawable.ninety9};

    private RecyclerView recyclerViewNames;
    private AllahNamesAdapter AllahNamesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namesof_allah);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Al Asma Ul Husna");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);


        recyclerViewNames = findViewById(R.id.recyclerview99Names);
        recyclerViewNames.setHasFixedSize(true);
        recyclerViewNames.setLayoutManager(new LinearLayoutManager(this));
        AllahNamesAdapter = new AllahNamesAdapter(this, NAMES, DESCRIPTION, IMAGES);
        recyclerViewNames.setAdapter(AllahNamesAdapter);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
