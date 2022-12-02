package brcom.etecia.listafilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listaFilmes;

    //Criar a base de dados para os filmes

    String titulo[] = {"Sing 2", "Angry Birds 2", "Planeta 51", "Pinguins de Madagascar", "Hotel Transilvania", "O chefe bebê"};
    String descricao[] = {getString(R.string.sing), getString(R.string.angry), getString(R.string.planeta),
            getString(R.string.pinguins), getString(R.string.transilvania), getString(R.string.chefinho)
    };
    String acesso[] = {"4.5", "5.0", "5.5", "4.8", "5.9", "6.0"};
    int filmes[] = {R.drawable.sing, R.drawable.angry, R.drawable.planeta, R.drawable.pinguins, R.drawable.transilvania, R.drawable.chefinho};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaFilmes = findViewById(R.id.idlistaFilmes);

        MyAdapter adapter = new MyAdapter();

        //preparar para instanciar o adaptador
        listaFilmes.setAdapter(adapter);
    }
    //criando uma inner class MyAdapter

    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return filmes.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            //Variaveis do modelo
            ImageView imagemFilme;
            TextView tituloFilme, descricaoFilme, acessoFilme;

            //Adaptador ligando ao modelo
            View v = getLayoutInflater().inflate(R.layout.modelo_filmes, null);

            //Apresentar as variaveis do java para o modelo xml
            imagemFilme = v.findViewById(R.id.imgFilmes);
            tituloFilme = v.findViewById(R.id.idTituloFilmes);
            descricaoFilme = v.findViewById(R.id.idDescricaoFilmes);
            acessoFilme = v.findViewById(R.id.idAcessoFilmes);

            //Inserindo os valores nas variaveis do java
            tituloFilme.setText(titulo[i]);
            descricaoFilme.setText(descricao[i]);
            acessoFilme.setText(acesso[i]);
            imagemFilme.setImageResource(filmes[i]);

            return v;
        }
    }
}