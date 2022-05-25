package projects.saransh.birthdaywishingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View){
        val intent = Intent(this,BirthdayGreetingActivity::class.java)
        val nameInput : EditText = findViewById(R.id.nameInput)
        val name = nameInput.editableText.toString()
        intent.putExtra(BirthdayGreetingActivity.NAME_Extra,name)
        startActivity(intent)
    }

}