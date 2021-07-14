package qr.a.rooshen.asiancuisine

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ScrollView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "hwKotlinLesson4"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnBegin = findViewById<AppCompatButton>(R.id.buttonBegin)
        val edtPhoneClient = findViewById<EditText>(R.id.editTextTextPersonName)
        btnBegin.setOnClickListener {
            BasketActivity.newInstance(this, edtPhoneClient.text.toString())
            Log.d(TAG,"phone client ${edtPhoneClient.text.toString()}")
        }
    }
}