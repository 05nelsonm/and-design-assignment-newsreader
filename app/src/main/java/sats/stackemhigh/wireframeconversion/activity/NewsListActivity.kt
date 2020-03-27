package sats.stackemhigh.wireframeconversion.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_news_list.*
import sats.stackemhigh.wireframeconversion.R

class NewsListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_list)

        iv_1.setOnClickListener {
            val detailView = Intent(this, NewsDetailActivity::class.java)
            startActivity(detailView)
        }

        iv_2.setOnClickListener {
            val detailView = Intent(this, NewsDetailActivity::class.java)
            startActivity(detailView)
        }

        iv_3.setOnClickListener {
            val detailView = Intent(this, NewsDetailActivity::class.java)
            startActivity(detailView)
        }

        iv_4.setOnClickListener {
            val detailView = Intent(this, NewsDetailActivity::class.java)
            startActivity(detailView)
        }

        iv_5.setOnClickListener {
            val detailView = Intent(this, NewsDetailActivity::class.java)
            startActivity(detailView)
        }

        iv_6.setOnClickListener {
            val detailView = Intent(this, NewsDetailActivity::class.java)
            startActivity(detailView)
        }

        iv_7.setOnClickListener {
            val detailView = Intent(this, NewsDetailActivity::class.java)
            startActivity(detailView)
        }

        iv_8.setOnClickListener {
            val detailView = Intent(this, NewsDetailActivity::class.java)
            startActivity(detailView)
        }

        iv_9.setOnClickListener {
            val detailView = Intent(this, NewsDetailActivity::class.java)
            startActivity(detailView)
        }
    }
}
