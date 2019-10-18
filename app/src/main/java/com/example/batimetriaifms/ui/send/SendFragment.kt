package com.example.batimetriaifms.ui.send

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.batimetriaifms.R
import com.example.batimetriaifms.activities.MainActivity
import kotlinx.android.synthetic.main.activity_main.*

class SendFragment : Fragment() {

    private lateinit var sendViewModel: SendViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nav_view.setOnClickListener {
            val accountsIntent = Intent(activity, MainActivity::class.java)
            startActivity(accountsIntent)
        }
    }
}