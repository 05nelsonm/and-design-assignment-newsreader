package sats.stackemhigh.wireframeconversion.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import sats.stackemhigh.wireframeconversion.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_sign_in.setOnClickListener {
            val signIn = Intent(this, NewsListActivity::class.java)
            startActivity(signIn)
        }
    }
}
