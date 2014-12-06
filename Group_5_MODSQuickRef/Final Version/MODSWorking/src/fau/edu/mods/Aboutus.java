package fau.edu.mods;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import fau.edu.MODsQuickRef.R;

public class Aboutus extends ActionBarActivity {
	public void openFirstLink(View view)
	{
		Uri webpage = Uri.parse("http://www.nmfs.noaa.gov/pr/species/turtles/loggerhead.htm");
	    Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
	    if (intent.resolveActivity(getPackageManager()) != null) {
	        startActivity(intent);
	    }
	}
	public void openSecondLink(View view)
	{
		Uri webpage = Uri.parse("http://animals.nationalgeographic.com/animals/reptiles/green-turtle/");
	    Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
	    if (intent.resolveActivity(getPackageManager()) != null) {
	        startActivity(intent);
	    }
	}
	public void openThirdLink(View view)
	{
		Uri webpage = Uri.parse("http://www.nmfs.noaa.gov/pr/species/turtles/leatherback.htm");
	    Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
	    if (intent.resolveActivity(getPackageManager()) != null) {
	        startActivity(intent);
	    }
	}
	public void openFourthLink(View view)
	{
		Uri webpage = Uri.parse("http://www.nmfs.noaa.gov/pr/species/turtles/hawksbill.htm");
	    Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
	    if (intent.resolveActivity(getPackageManager()) != null) {
	        startActivity(intent);
	    }
	}


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_aboutus);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		overridePendingTransition(R.anim.from_top, R.anim.to_bottom);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.aboutus, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_aboutus,
					container, false);
			return rootView;
		}
	}

}
