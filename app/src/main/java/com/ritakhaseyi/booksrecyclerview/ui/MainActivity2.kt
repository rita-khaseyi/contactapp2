package com.ritakhaseyi.booksrecyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ritakhaseyi.booksrecyclerview.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.addButton.setOnClickListener(){
            validateSign()
        }

    }

    fun validateSign() {
        val firstname = binding.etName.text.toString()
        val phoneNUmber=binding.etPhone.text.toString()
        val email=binding.etEmail.text.toString()
        var error=false
        if (firstname.isBlank()){
            binding.textInputLayout.error="Name is required"
            error=true
        }
        if (email.isBlank()){
            binding.textInputLayout3.error="Email is required"
            error=true
        }
        if (phoneNUmber.isBlank()){
            binding.textInputLayout2.error="phone number is required"
            error=true
        }
        if(!error){
           Toast.makeText(this,"$firstname $phoneNUmber $email",Toast.LENGTH_LONG)
                .show()
       }
    }
}



//
//    override fun onResume() {
//        super.onResume()
//        binding.tvlogin.setOnClickListener {
//            val intent=Intent(this,Loginactivity::class.java)
//            startActivity(intent)
//        }
//        binding.button.setOnClickListener {
//            valdateSignup()
//        }
//
//    }
//
//    fun valdateSignup(){
//        val firstName=binding.etFirstname.text.toString()
//        val lastName=binding.etLastname.text.toString()
//        val Email=binding.etEmail.text.toString()
//        val password=binding.etPassword.text.toString()
//        val passwordConfirmation=binding.etpasswordConfirmation.text.toString()
//        var error=false
//        if (firstName.isBlank()){
//            binding.tilFirstname.error="first name is required"
//            error=true
//        }
//
//        if (lastName.isBlank()){
//            binding.tilLastname.error="Last name is required"
//            error=true
//        }
//
//        if (Email.isBlank()){
//            binding.tilEmail.error="Email is required"
//            error=true
//        }
//        if (Email !="ritakhaseyi@gmail.com"){
//            binding.tilEmail.error="invalid email"
//        }
//
//        if (password.isBlank()){
//            binding.tilPassword.error="password is required"
//            error=true
//        }
//        if (password != "sandpaper"){
//            binding.tilPassword.error="wrong password"
//        }
//        if (passwordConfirmation.isBlank()){
//            binding.tilPasswordConfirmation.error="password confirmation is required"
//            error=true
//        }
//        if(password !=passwordConfirmation){
//            binding.tilPasswordConfirmation.error="password and passsword confirmation do not match"
//            error=true
//        }
//        if(!error){
//            Toast.makeText(this,"$firstName $lastName $Email",Toast.LENGTH_LONG)
//                .show()
//        }
//
//
//
//
//
//    }
//
//}