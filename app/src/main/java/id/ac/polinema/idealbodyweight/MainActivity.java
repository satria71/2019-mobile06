package id.ac.polinema.idealbodyweight;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import id.ac.polinema.idealbodyweight.fragments.AboutFragment;
import id.ac.polinema.idealbodyweight.fragments.MenuFragment;

public class MainActivity extends AppCompatActivity implements
		MenuFragment.OnFragmentInteractionListener {

	// Deklarasikan atribut Fragment di sini
	private AboutFragment aboutFragment;
	private MenuFragment menuFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		aboutFragment = AboutFragment.newInstance("Satria Putra Sabana");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu, menu);
		return  true;
	}

	@Override
	public boolean onOptionsItemSelected(@NonNull MenuItem item) {
		// TODO: Tambahkan penanganan menu di sini
		getSupportFragmentManager().beginTransaction()
				.replace(R.id.fragment_container, aboutFragment)
				.addToBackStack(null)
				.commit();
		getSupportFragmentManager().beginTransaction()
				.replace(R.id.fragment_container, menuFragment);


		return super.onOptionsItemSelected(item);
	}

    public void handlerAboutFragment(View view) {
    }

	@Override
	public void onBrocaIndexButtonClicked() {

	}

	@Override
	public void onBodyMassIndexButtonClicked() {

	}
}
