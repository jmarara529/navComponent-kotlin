package es.jmarara529.navcomponent_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import es.jmarara529.navcomponent_kotlin.databinding.FragmentSegundoBinding
import es.jmarara529.navcomponent_kotlin.databinding.FragmentTerceroBinding

class tercero : Fragment(), View.OnClickListener {

    private var _binding: FragmentTerceroBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTerceroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.volverIniciobutton.setOnClickListener(this)




    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.volverIniciobutton -> {
                findNavController().navigate(R.id.action_tercero_to_home_fragment)
            }
        }
    }
}