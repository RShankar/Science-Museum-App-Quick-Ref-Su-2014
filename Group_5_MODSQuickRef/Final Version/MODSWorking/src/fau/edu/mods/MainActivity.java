package fau.edu.mods;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import fau.edu.MODsQuickRef.R;
public class MainActivity extends ActionBarActivity {
	
	public void openHome(View view)
	{
		Intent intent = new Intent(this, HomeScreen.class);
		startActivity(intent);
	}
	
	public void openSpecialEvents(View view)
	{
		Uri webpage = Uri.parse("http://www.mods.org/events/calendar.htm");
	    Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
	    if (intent.resolveActivity(getPackageManager()) != null) {
	        startActivity(intent);
	    }
	}
	
	public void openTodaysHour(View view)
	{
		Uri webpage = Uri.parse("http://www.mods.org/visit/index.htm#hours");
	    Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
	    if (intent.resolveActivity(getPackageManager()) != null) {
	        startActivity(intent);
	    }
	}
	 public void openMainScreenLogo(View view)
		{
			Uri webpage = Uri.parse("https://www.google.com/maps/place/401+SW+2nd+St/@26.120993,-80.147971,17z/data=!3m1!4b1!4m2!3m1!1s0x88d900f966e37919:0x8241f6560c1b1a08");
		    Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
		    if (intent.resolveActivity(getPackageManager()) != null) {
		        startActivity(intent);
		    }
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		overridePendingTransition(R.anim.from_top, R.anim.to_bottom);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
