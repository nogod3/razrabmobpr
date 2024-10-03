import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.nestedlayouts.R 

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootLayout: View = findViewById(R.id.rootLayout)
        ViewCompat.setOnApplyWindowInsetsListener(rootLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val text1_1: TextView = findViewById(R.id.layout1TxtView1)
        val text1_2: TextView = findViewById(R.id.layout1TxtView2)
        val text1_3: TextView = findViewById(R.id.layout1TxtView3)
        val text2_1: TextView = findViewById(R.id.layout2TxtView1)
        val text2_2: TextView = findViewById(R.id.layout2TxtView2)
        val text2_3: TextView = findViewById(R.id.layout2TxtView3)
        val text3_1: TextView = findViewById(R.id.layout3TxtView1)
        val text3_2: TextView = findViewById(R.id.layout3TxtView2)
        val text3_3: TextView = findViewById(R.id.layout3TxtView3)
        val button: Button = findViewById(R.id.roll_button)

        var number: Int = 0

        button.setOnClickListener {
            if (text1_1.text.isNotEmpty()) {
                number = text1_1.text.toString().toIntOrNull() ?: 0
                ++number

                text1_1.text = ""
                text2_1.text = ""
                text3_1.text = ""

                text1_2.text = number.toString()
                text2_2.text = number.toString()
                text3_2.text = number.toString()
            } else if (text1_2.text.isNotEmpty()) {
                number = text1_2.text.toString().toIntOrNull() ?: 0
                ++number

                text1_2.text = ""
                text2_2.text = ""
                text3_2.text = ""

                text1_3.text = number.toString()
                text2_3.text = number.toString()
                text3_3.text = number.toString()
            } else if (text1_3.text.isNotEmpty()) {
                number = text1_3.text.toString().toIntOrNull() ?: 0
                ++number

                text1_3.text = ""
                text2_3.text = ""
                text3_3.text = ""

                text1_1.text = number.toString()
                text2_1.text = number.toString()
                text3_1.text = number.toString()
            }
        }
    }
}
