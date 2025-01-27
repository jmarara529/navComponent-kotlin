package es.jmarara529.navcomponent_kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import es.jmarara529.navcomponent_kotlin.databinding.FragmentSegundoBinding

class Segundo : Fragment(), View.OnClickListener {

    private  var _binding: FragmentSegundoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        _binding = FragmentSegundoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

       binding.pantallafinalbutton.setOnClickListener(this)


        val texto = arguments?.getString("texto")
        val numero = arguments?.getInt("numero")

        binding.textView.text = "El texto es: $texto"
        binding.numView.text = "el numero es: $numero"




    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.pantallafinalbutton -> {
                findNavController().navigate(R.id.action_segundo_to_tercero)
            }
        }
    }


}