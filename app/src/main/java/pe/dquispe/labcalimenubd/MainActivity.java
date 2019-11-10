package pe.dquispe.labcalimenubd;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.menu_home:
                        showHome();
                        break;
                    case R.id.menu_favorito:
                        showFavorito();
                        break;
                    case R.id.menu_archivados:
                        showArchivado();
                        break;
                }
                return true;
            }
        });
        showHome();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_reload:
                showHome();
                break;
            case R.id.action_home:
                showHome();
                break;
            case R.id.action_favorito:
                showFavorito();
                break;
            case R.id.action_archivado:
                showArchivado();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void showHome(){
        Fragment fragment = new HomeFragment();
        getSupportFragmentManager()
                .beginTransaction().replace(R.id.content, fragment).commit();
        Toast.makeText(this, "¡Bienvenido!", Toast.LENGTH_SHORT).show();
    }

    private void showFavorito(){
        Fragment fragment = new FavoritoFragment();

        getSupportFragmentManager()
                .beginTransaction().replace(R.id.content, fragment).commit();
        Toast.makeText(this, "¡Favoritos!", Toast.LENGTH_SHORT).show();
    }

    private void showArchivado(){
        Fragment fragment = new ArchivadoFragment();

        getSupportFragmentManager()
                .beginTransaction().replace(R.id.content, fragment).commit();
        Toast.makeText(this, "¡Archivados!", Toast.LENGTH_SHORT).show();
    }
}
