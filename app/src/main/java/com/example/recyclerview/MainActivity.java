package com.example.recyclerview;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // creating array list for our categories,
    // different news and category recycler view.
    private ArrayList<CategoriesModal> categoriesModalArrayList;
    private ArrayList<NewsModal> popularNewsArrayList, sportsNews, techNews;
    private RecyclerView catRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing our variables.
        catRV = findViewById(R.id.idRVNewsCategories);
        categoriesModalArrayList = new ArrayList<>();

        // popular news array list.
        popularNewsArrayList = new ArrayList<>();
        popularNewsArrayList.add(new NewsModal("Bihar Board 10th Result 2021: Bihar matric result announced; 78.17% passed", "Bihar Board Result: The Bihar education board on Monday declared the class 10 results. The Bihar Board has made the BSEB 10th result and scores available on the Board's website — biharboardonline.bihar.gov.in — for public access. Candidates are recommended to stay connected with the Times of India Education for latest updates on BSEB 10th Result 2021."));
        popularNewsArrayList.add(new NewsModal("IPL 2021: Full squad, players list of all eight teams", "In the IPL 2021 Player Auction, South African all-rounder Chris Morris made headlines by becoming IPL's most expensive buy of all time. Morris was fetched by Rajasthan Royals for a mammoth Rs. 16.25 crore. Meanwhile Krishnappa Gowtham became the highest uncapped Indian buy of all time. He was bought by Chennai Super Kings for Rs. 9.25"));
        popularNewsArrayList.add(new NewsModal("Bihar Board 10th Result 2021: Bihar matric result announced; 78.17% passed", "Bihar Board Result: The Bihar education board on Monday declared the class 10 results. The Bihar Board has made the BSEB 10th result and scores available on the Board's website — biharboardonline.bihar.gov.in — for public access. Candidates are recommended to stay connected with the Times of India Education for latest updates on BSEB 10th Result 2021."));
        popularNewsArrayList.add(new NewsModal("IPL 2021: Full squad, players list of all eight teams", "In the IPL 2021 Player Auction, South African all-rounder Chris Morris made headlines by becoming IPL's most expensive buy of all time. Morris was fetched by Rajasthan Royals for a mammoth Rs. 16.25 crore. Meanwhile Krishnappa Gowtham became the highest uncapped Indian buy of all time. He was bought by Chennai Super Kings for Rs. 9.25"));

        // on below line we are adding our first category.
        categoriesModalArrayList.add(new CategoriesModal("Popular News", popularNewsArrayList));

        // sports news.
        sportsNews = new ArrayList<>();
        sportsNews.add(new NewsModal("AB de Villiers loves RCB, he and Maxwell made the difference: Kohli", "AB de Villiers loves RCB, he and Maxwell made the difference: Kohli"));
        sportsNews.add(new NewsModal("Glenn Maxwell made it easier: AB de Villiers after scripting RCB win vs KKR", "Glenn Maxwell made it easier: AB de Villiers after scripting RCB win vs KKR"));
        sportsNews.add(new NewsModal("PBKS vs DC: Steve Smith makes Delhi Capitals debut in Mumbai", "PBKS vs DC: Steve Smith makes Delhi Capitals debut in Mumbai"));
        sportsNews.add(new NewsModal("DC vs PBKS IPL 2021 Match 11: Live story and ball-by-ball commentary", "DC vs PBKS IPL 2021 Match 11: Live story and ball-by-ball commentary"));

        // on below line we are creating our second category.
        categoriesModalArrayList.add(new CategoriesModal("Sports", sportsNews));

        // technology news.
        techNews = new ArrayList<>();
        techNews.add(new NewsModal("PlayStation 5’s latest update brings storage expansion, new social features", "PlayStation 5’s latest update brings storage expansion, new social features"));
        techNews.add(new NewsModal("OnePlus 9R gets first major OxygenOS update, here are the details\n" + "The Oxygen 11.2.1.", "OnePlus 9R gets first major OxygenOS update, here are the details\n" + "The Oxygen 11.2.1."));
        techNews.add(new NewsModal("Domino's India database likely hacked, 1 million credit card details leaked", "Domino's India database likely hacked, 1 million credit card details leaked"));
        techNews.add(new NewsModal("iPhone 13 Product Red appears in renders, show design changes", "iPhone 13 Product Red appears in renders, show design changes"));

        // on below line we are adding our third category.
        categoriesModalArrayList.add(new CategoriesModal("Technology", techNews));

        // on below line we are setting layout manager to our recycler view.
        catRV.setLayoutManager(new LinearLayoutManager(this));

        // on below line we are creating and setting adapter to our recycler view.
        CategoriesRVAdapter adapter = new CategoriesRVAdapter(categoriesModalArrayList, this);
        catRV.setAdapter(adapter);

    }
}
