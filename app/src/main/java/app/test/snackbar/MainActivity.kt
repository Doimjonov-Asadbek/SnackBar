package app.test.snackbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var btnSnackBar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSnackBar = findViewById(R.id.SnackBarBtn)

        btnSnackBar.setOnClickListener {
            val snackbar = Snackbar.make(it, "SnackBar", Snackbar.LENGTH_SHORT).setAction("Action", null)
            snackbar.setActionTextColor(Color.WHITE)
            val snackbarView = snackbar.view
            snackbarView.setBackgroundColor(Color.BLACK)
            snackbar.show()
        }

    }
}