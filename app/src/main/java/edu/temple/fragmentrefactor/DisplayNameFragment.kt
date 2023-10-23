package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class DisplayNameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layout = inflater.inflate(R.layout.fragment_display_name, container, false)

        val myButton = layout.findViewById<Button>(R.id.changeButton2)
        val myTextInput = layout.findViewById<EditText>(R.id.nameEditText2)
        val myDisplayText = layout.findViewById<TextView>(R.id.displayTextView2)
        val name = myTextInput.text.toString()

        myButton.setOnClickListener {
            if(name != ""){
                myDisplayText.text = "Hello, $name!"
            }
            else {
                myDisplayText.text = "Please enter your name"
            }
        }

        return layout
    }

}