package vinay.com.dagger2patrick;

import android.location.Location;

import java.util.LinkedList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

/**
 * Created by VPPL-10132 on 27-12-2016.
 */
@Module
public class AppModule {


	private List<Location> allLocations = new LinkedList<>();

	@Provides
	public List<Location> provideLocations() {
		return allLocations;
	}

}
