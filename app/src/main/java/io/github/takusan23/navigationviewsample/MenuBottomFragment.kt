package io.github.takusan23.navigationviewsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottom_fragment_menu.*

class MenuBottomFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // メニュー押したとき
        bottom_fragment_menu_navigation_view.setNavigationItemSelectedListener {
            Toast.makeText(context, it.title, Toast.LENGTH_SHORT).show()
            true
        }
    }

}