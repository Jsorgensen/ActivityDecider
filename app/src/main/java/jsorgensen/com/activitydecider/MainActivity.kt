package jsorgensen.com.activitydecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val activityList = arrayListOf("Go to the Park", "Color", "Make a Snack", "Watch a Show", "Go for a Walk")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideActivityButton.setOnClickListener {
            val random = Random()
            val randomActivity = random.nextInt(activityList.count())
            selectedActivityText.text = activityList[randomActivity]
        }

        addActivityButton.setOnClickListener {
            val newActivity = addActivityText.text.toString()
            activityList.add(newActivity)
            addActivityText.text.clear()
        }

        removeActivityButton.setOnClickListener{
            val removeActivity = addActivityText.text.toString()
            activityList.remove(removeActivity)
            addActivityText.text.clear()
        }
    }
}
