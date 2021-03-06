package com.example.shayanmoradi.ezshop.result;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.shayanmoradi.ezshop.R;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.shayanmoradi.ezshop.result.ReulstFragment.CATEGORY_ID;
import static com.example.shayanmoradi.ezshop.result.ReulstFragment.SEARCHING_STRING;
import static com.example.shayanmoradi.ezshop.result.ReulstFragment.TRUE_FOR_CATEGORY;

public class ReultActivity extends AppCompatActivity {
    private static final String ORDER_BY = "com.example.shayanmoradi.ezshop.itemsofcategory.orderby";
    public static Intent newIntent(Context context,boolean trueForCategory, int categoryId, String searchString,String orderBy) {
        Intent intent = new Intent(context, ReultActivity.class);
        intent.putExtra(TRUE_FOR_CATEGORY,trueForCategory);
        intent.putExtra(CATEGORY_ID, categoryId);
        intent.putExtra(ORDER_BY, orderBy);
        intent.putExtra(SEARCHING_STRING, searchString);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reult);
        int categoryID = (int) getIntent().getSerializableExtra(CATEGORY_ID);
        String searchString= (String) getIntent().getSerializableExtra(SEARCHING_STRING);
      boolean trueForCategory = (boolean) getIntent().getSerializableExtra(TRUE_FOR_CATEGORY);
String orderBy=(String) getIntent().getSerializableExtra(ORDER_BY);
        ReulstFragment fragment1 = ReulstFragment.newInstance(trueForCategory,categoryID,searchString,orderBy);
        getSupportFragmentManager()
                .beginTransaction()

                .replace(R.id.result_contier,fragment1)
                .commit();
    }
}
