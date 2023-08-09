package com.ritakhaseyi.booksrecyclerview.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ritakhaseyi.booksrecyclerview.model.bookData
import com.ritakhaseyi.booksrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.floatingActionButton.setOnClickListener {
            // Handle the floating action button click here
            openMainActivity2()
        }
    }
    override fun onResume() {
      super.onResume()
        displayBooks()

   }


    fun displayBooks(){
        var book4= bookData( 0 ,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQS48qcUZ2liC2_1RF_Dz41hAu4Z-CO6zcHA&usqp=CAU","purity","linda@gmail.com",24567023)
        var book5= bookData( 0,"https://media.istockphoto.com/id/1396161407/photo/smiling-woman-with-afro-hair-looking-to-the-side.webp?b=1&s=170667a&w=0&k=20&c=-zmqRxsv_s0n42JQrQNO9uOxr91LCvub2WZWrHGI1-4=","desire pursuit","lindseyg@gmail.com",2023)
        var book6= bookData(0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSDWw8Vdm9JSAzsSu6MANcNR3pE0wZOISapEA&usqp=CAU","desire ","lindsey@gmail.com",20234567)
        var book7= bookData(0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSMFOHVXnIzegFdSgjj6wkG6Wp2ScgGyneP-Q&usqp=CAU","patricia","patricia@gmail.com",20233456)
        var book8= bookData(0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRg5lHRbx2Uw-SE-NKkAuXe55bfVJjLSD_rIw&usqp=CAU","kimmy","lindsey@gmail.com",20233456)
        var book9= bookData(0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2hq8Ape-Wtz81hck2-erkagy2jvltZeh8ETCxhHXwyIytD0zg05d1aHXxRTVO03FaZzY&usqp=CAU","aliyah","lindsey",2034567623)
        var book10= bookData(0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2hq8Ape-Wtz81hck2-erkagy2jvltZeh8ETCxhHXwyIytD0zg05d1aHXxRTVO03FaZzY&usqp=CAU","desire pursuit","lindsey",2023)
        var book11= bookData(0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2hq8Ape-Wtz81hck2-erkagy2jvltZeh8ETCxhHXwyIytD0zg05d1aHXxRTVO03FaZzY&usqp=CAU","precious","lindsey",2023)
        var book12= bookData(0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSsX31ZGkkVvq-tFD-hYds8ClTIu4p4aZiGPyQBhAEclUlYLsAhTnRkO3b9qAx1Sa2NDPU&usqp=CAU","desire pursuit","lindsey",2023)
        var book13= bookData(0,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSmzDMK4-sGg5UBsIgSHdzrnxcrMGXQlOW697-0DIYr5us9Gx5L2vFfqYM8nRM7IrxmNJU&usqp=CAU","desire pursuit","lindsey",2023)

        var booklist= listOf<bookData>(book4,book5,book6,book7,book8,book9,book10,book11,book12,book13)
        binding.rvbooks.layoutManager=LinearLayoutManager(this)
        var bookAdapter= booksRvAdapter(booklist)
        binding.rvbooks.adapter=bookAdapter



    }

    private fun openMainActivity2() {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}


//class MainActivity : AppCompatActivity() {
//    lateinit var binding: ActivityMainBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//    }
//
//    override fun onResume() {
//        super.onResume()
//        displayTweets()
//    }
//
//
//    fun displayTweets() {
//        var tweet1 = TweetData(
//            "", "rita", " @ritazee",
//            "I am a woman I deserve to be heard", 4, 5, 60
//        )
//        var tweet2 = TweetData(
//            "", "wendy", " @ritazee",
//            "I am a woman I deserve to be heard", 4, 5, 60
//        )
//        var tweet3 = TweetData(
//            "", "kimani", " @ritazee",
//            "I am a woman I deserve to be heard this is not a request", 4, 5, 60
//        )
//        var tweet4 = TweetData(
//            "", "leiz", " @ritazee",
//            "I am a woman I deserve to be heard i enjoy listening to music", 4, 5, 60
//        )
//        var tweet5 = TweetData(
//            "", "marisa", " @ritazee",
//            "I am a woman I deserve to be heard ever thought about it?", 4, 5, 60
//        )
//        var tweet6 = TweetData(
//            "", "aaliyah", " @ritazee",
//            "I am a woman I deserve to be heard why do i need to keep saying this", 4, 5, 60
//        )
//        var tweet7 = TweetData(
//            "", "kendy", " @ritazee",
//            "I am a woman I deserve to be heard this is odd way to say it out loud", 4, 5, 60
//        )
//        var tweet8 = TweetData(
//            "", "annet", " @ritazee",
//            "I am a woman I deserve to be heard not being weird but broooo wtf is this", 4, 5, 60
//        )
//        var tweet9 = TweetData(
//            "", "kimmy", " @ritazee",
//            "I am a woman I deserve to be heard kot nation yes you heard me yesss you did", 4, 5, 60
//        )
//        var tweet10 = TweetData(
//            "", "arlette", " @ritazee",
//            "I am a woman I deserve to be heard aliyah davidson this is for you", 4, 5, 60
//        )
//        var tweetlist = listOf<TweetData>(
//            tweet1,
//            tweet2,
//            tweet3,
//            tweet4,
//            tweet5,
//            tweet6,
//            tweet7,
//            tweet8,
//            tweet9,
//            tweet10
//        )
//        binding.rvtweets.layoutManager= LinearLayoutManager(this)
//        var tweetAdapter=tweetsrvAdapter(tweetlist)
//        binding.rvtweets.adapter=tweetAdapter
//
//
//    }
//
//}