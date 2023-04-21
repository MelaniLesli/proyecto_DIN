package panel_pasatiempos;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.doitnow.R;


public class ListaPasatiempos extends Fragment {



    public ListaPasatiempos() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pasatiempos, container, false);

        ListView lista = view.findViewById(R.id.list_view);
        String[] listaActividades = getResources().getStringArray(R.array.lista_de_actividades);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.activity_list_item, listaActividades);
        lista.setAdapter(adapter);

        return view;
    }
}