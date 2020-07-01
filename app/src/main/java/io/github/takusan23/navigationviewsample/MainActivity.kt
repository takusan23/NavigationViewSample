package io.github.takusan23.navigationviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // BottomFragment開く
        activity_main_bottom_menu.setOnClickListener {
            MenuBottomFragment().show(supportFragmentManager, "menu")
        }
    }
}