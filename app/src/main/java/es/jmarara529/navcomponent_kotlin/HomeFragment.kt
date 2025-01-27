package es.jmarara529.navcomponent_kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import es.jmarara529.navcomponent_kotlin.databinding.FragmentHomeFragmentBinding


class HomeFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentHomeFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View { // Cambiado a View
        _binding = FragmentHomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.submitButton.setOnClickListener(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.submitButton -> {
                if (binding.editTextText.text.isNotEmpty() && binding.editTextNumber.text.isNotEmpty()) {

                    val texto = view?.findViewById<EditText>(R.id.editTextText)?.text.toString()
                    val numero = view?.findViewById<EditText>(R.id.editTextNumber)?.text.toString().toInt()

                    val action = HomeFragmentDirections.actionHomeFragmentToSegundo(texto, numero)

                    findNavController().navigate(action)

                } else {
                    Toast.makeText(requireContext(), "Rellena los campos", Toast.LENGTH_SHORT)
                        .show()
                }

            }
        }
    }
}