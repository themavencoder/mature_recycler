package com.aloine.mature_recycler.model;

import com.aloine.mature_recycler.R;

import java.util.ArrayList;
import java.util.List;

public class Datas {


    public static List<Model> MODEL = new ArrayList<>();
   static {
       Model rebecca = new Model(R.drawable.rebecca_franks,R.string.name_one,R.string.country_one,R.string.description_one);
       MODEL.add(rebecca);
       Model marcelo = new Model(R.drawable.marcelo_ricardo,R.string.name_two,R.string.country_two,R.string.description_two);
       MODEL.add(marcelo);
       Model cyril = new Model(R.drawable.cyril_motier,R.string.name_three,R.string.country_three,R.string.description_three);
       MODEL.add(cyril);




   }

}
