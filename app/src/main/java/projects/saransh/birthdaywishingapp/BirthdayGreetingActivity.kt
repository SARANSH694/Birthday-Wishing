package projects.saransh.birthdaywishingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val NAME_Extra = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_Extra)
        val bithdayGreeting : TextView= findViewById(R.id.bithdayGreeting)
        bithdayGreeting.text = "Happy Birthday\n$name"
    }
}