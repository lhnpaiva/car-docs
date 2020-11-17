package com.example.cardocs.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.cardocs.R

class ViewPagerAdapter(var loginActivity: LoginActivity) : RecyclerView.Adapter<ViewPagerAdapter.PageHolder>() {

    override fun getItemCount(): Int = 2

    override fun onBindViewHolder(holder: PageHolder, position: Int) {
        getItem(position, holder)
    }

    class PageHolder(root: View) : RecyclerView.ViewHolder(root) {
        val frameLayout = root.findViewById<FrameLayout>(R.id.frameLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_inflate, parent, false)
        return PageHolder(view)
    }

    fun getItem(position: Int, view: PageHolder) {
        return when (position) {
            0 -> showFirstPage(view)
            1 -> showSecondPage(view)
            else -> Toast.makeText(
                view.itemView.context,
                "Erro ao carregar informações",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    private fun showFirstPage(view: PageHolder) {
        val ft = loginActivity.supportFragmentManager.beginTransaction()
        RegisterFirstPageFragment.newInstance("", "")?.let {
            ft.replace(R.id.frameLayout, it)
            ft.commit()
        }
    }

    private fun showSecondPage(view: PageHolder) {
        val ft = loginActivity.supportFragmentManager.beginTransaction()
        RegisterSecondPageFragment.newInstance("", "")?.let {
            ft.replace(R.id.frameLayout, it)
            ft.commit()
        }
    }
}