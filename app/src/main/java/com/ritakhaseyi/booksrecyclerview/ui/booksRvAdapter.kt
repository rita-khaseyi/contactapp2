package com.ritakhaseyi.booksrecyclerview.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ritakhaseyi.booksrecyclerview.model.bookData
import com.ritakhaseyi.booksrecyclerview.databinding.BookNameListBinding
import com.squareup.picasso.Picasso

class booksRvAdapter( var booklist:List<bookData>):RecyclerView.Adapter<booksViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): booksViewHolder {
        var binding=BookNameListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return booksViewHolder(binding)



    }

    override fun onBindViewHolder(holder: booksViewHolder, position: Int) {
        var  book=booklist[position]
        holder.binding.apply {
            tvTitle.text=book.BookTitle
            tvAuthor.text=book.AuthorName
            tvYear.text=book.publication.toString()
            Picasso
                .get()
                .load(book.avatar)
                .resize(80,80)
                .centerCrop()
                .into(holder.binding.imageView)







        }

    }

    override fun getItemCount(): Int {
        return booklist.size
    }
}

class booksViewHolder(var binding: BookNameListBinding):RecyclerView.ViewHolder(binding.root){

}
