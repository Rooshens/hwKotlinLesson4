package qr.a.rooshen.asiancuisine

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class BasketActivity : AppCompatActivity() {

    companion object {
        private const val KEY_PHONE = "Phone"
        fun newInstance(activity: Activity, Phone: String) {
            val sendPhoneClient = Intent(activity, BasketActivity::class.java).apply {
                putExtra(KEY_PHONE, Phone)
            }
            activity.startActivity(sendPhoneClient)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.basket_main)
        val tvClientPhone = findViewById<TextView>(R.id.tvClientPhone)
        tvClientPhone.text = "тел. " + intent.getStringExtra(KEY_PHONE)
    }
}