package com.boredbees.gre2k17;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class References extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_references);

    }
    public void browser1(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=0ahUKEwie7-OR57nRAhXFNo8KHdiUAXUQFggZMAA&url=https%3A%2F%2Fwww.ets.org%2Fs%2Fgre%2Fpdf%2Fpractice_book_GRE_pb_revised_general_test.pdf&usg=AFQjCNEIKoWsmDfLPweDJ9u0UeRg2LmxCw&sig2=lz8W7yOnsMBThiYzGiKdSQ"));
        startActivity(i);
    }
    public void browser2(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/url?sa=t&rct=j&q=&esrc=s&source=web&cd=2&cad=rja&uact=8&ved=0ahUKEwie7-OR57nRAhXFNo8KHdiUAXUQFggeMAE&url=https%3A%2F%2Fwww.ets.org%2Fs%2Fgre%2Fpdf%2Fpractice_book_math.pdf&usg=AFQjCNHO5Z7_9WxufkCzxQj2ggUgjYjnxg&sig2=DjynFrF2JmS3ZxjxsG3_9A"));
        startActivity(i);
    }
    public void browser3(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/url?sa=t&rct=j&q=&esrc=s&source=web&cd=3&cad=rja&uact=8&ved=0ahUKEwie7-OR57nRAhXFNo8KHdiUAXUQFggjMAI&url=http%3A%2F%2Fweb.csulb.edu%2F~acarter3%2Fcourse-carterlab%2FBarrons_New_GRE_19th_ed.pdf&usg=AFQjCNHIgixRdQHVTpvspYEOxev5-dggRg&sig2=JR_RJOBHGGzM2XTyEQ-uBA"));
        startActivity(i);
    }
    public void browser4(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/url?sa=t&rct=j&q=&esrc=s&source=web&cd=5&cad=rja&uact=8&ved=0ahUKEwie7-OR57nRAhXFNo8KHdiUAXUQFgguMAQ&url=http%3A%2F%2Fmagoosh.resources.s3.amazonaws.com%2FMagoosh%2520GRE%2520eBook.pdf&usg=AFQjCNEuu-z_2yYeQLug1bbdt4nUQJxahQ&sig2=0MI87zKqDgcrQdyyehBG9w"));
        startActivity(i);
    }
    public void browser5(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/url?sa=t&rct=j&q=&esrc=s&source=web&cd=6&cad=rja&uact=8&ved=0ahUKEwie7-OR57nRAhXFNo8KHdiUAXUQFgg0MAU&url=http%3A%2F%2Fmagoosh.resources.s3.amazonaws.com%2FMagoosh-GRE-Vocab-eBook.pdf&usg=AFQjCNGBGRys4W9-RNPnw2VfCw5PPq9yeQ&sig2=8sSTIsvo-bBck54vUKQhag"));
        startActivity(i);
    }
}
