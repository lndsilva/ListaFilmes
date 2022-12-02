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
    String descricao[] = {"Quando um coala eternamente otimista organiza uma competição de canto para salvar seu teatro falido, animais de toda a cidade se reúnem para se destacar e perseguir seus sonhos!",
            "Os pássaros irritados que não voam e os porquinhos verdes intrigantes levam sua carne para o próximo nível em The Angry Birds Movie 2!",
            "O capitão Charles T. Baker acredita ser o primeiro ser vivo a chegar ao planeta 51. Na verdade o planeta é habitado por uma grande população de seres verdes, que temem a chegada do alienígena: o próprio capitão.",
            "Eles são fofos...eles são fofinhos...eles estão de volta! Dos criadores de MADAGASCAR vem o filme hilário que prova que a espionagem global é para os pássaros!",
            "Quando a misteriosa invenção de Van Helsing dá errado, Drac e seus amigos são transformados em humanos e Johnny se torna um monstro! Em seus novos corpos incompatíveis, Drac e Johnny devem se unir para encontrar uma cura.",
            "O Poderoso Chefão é uma história hilariante e universal sobre como a chegada de um novo bebê afeta uma família, contada do ponto de vista de um narrador deliciosamente não confiável, um garoto de 7 anos muito imaginativo chamado Tim."
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