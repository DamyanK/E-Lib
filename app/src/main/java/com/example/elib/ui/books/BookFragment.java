package com.example.elib.ui.books;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.elib.R;
import com.example.elib.adapters.BookAdapter;
import com.example.elib.databinding.FragmentGalleryBinding;
import com.example.elib.models.BookElements;
import com.example.elib.requests.ApiClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookFragment extends Fragment {

    private BookViewModel bookViewModel;
    private FragmentGalleryBinding binding;
    private List<BookElements> bookList = new ArrayList();
    private RecyclerView recyclerView;
    private SearchView searchView;

    View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bookViewModel =
                new ViewModelProvider(this).get(BookViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        root = binding.getRoot();


        recyclerView = root.findViewById(R.id.list_books_rv);
        searchView = root.findViewById(R.id.searchView);
        getBooks();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                List<BookElements> filterdList = new ArrayList<>();
                String input = searchView.getQuery().toString();
                for(int i=0;i<bookList.size();i++) {
                    if (bookList.get(i).getBookTitle().getRendered().toLowerCase(Locale.ROOT).contains(input.toLowerCase(Locale.ROOT))){
                        filterdList.add(bookList.get(i));
                    }
                }
                if(input==null){
                    PutDataIntoRecycleView(bookList);
                }else {
                    PutDataIntoRecycleView(filterdList);
                }
                return false;
            }
        });


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    private void getBooks(){
        Call<List<BookElements>> responseCall = ApiClient.getService().getBooks();

        responseCall.enqueue(new Callback<List<BookElements>>() {
            @Override
            public void onResponse(Call<List<BookElements>> call, Response<List<BookElements>> response) {
              if(response.isSuccessful()) {
                  bookList = response.body();
                  PutDataIntoRecycleView(bookList);
              }else{
                  Log.e("bookRequestError", "Error");
              }
            }

            @Override
            public void onFailure(Call<List<BookElements>> call, Throwable t) {
                Log.e("bookRequestError", t.getMessage().toString());
            }
        });
    }

    private void PutDataIntoRecycleView(List<BookElements> postList){
        BookAdapter adapter = new BookAdapter(root.getContext(),postList);

        recyclerView.setLayoutManager(new LinearLayoutManager(root.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}