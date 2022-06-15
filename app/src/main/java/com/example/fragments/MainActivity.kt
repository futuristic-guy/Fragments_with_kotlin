package com.example.fragments
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.commit
import com.example.fragments.fragment.FragmentA
import com.example.fragments.fragment.FragmentB

class MainActivity : AppCompatActivity(), Communicator {

    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragmentA = FragmentA()
        supportFragmentManager.commit{
            replace(R.id.fragment_container, fragmentA)
        }

    }

    //communicator Implementation for Fragment_A and Fragment_B
    override fun passDataCommunicator(text: String) {
        var bundle: Bundle? = Bundle()
        bundle?.putString("Message", text)


        var fragmentB = FragmentB()
        fragmentB.arguments = bundle
        supportFragmentManager.commit {
            replace(R.id.fragment_container, fragmentB)
            setReorderingAllowed(true)
            addToBackStack("Second Fragment")
        }

    }

}