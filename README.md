# Settings.java

## Usage

```java
    Settings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, this);

        Handler handler =  new Handler();
        handler.postDelayed(runnable, 5000);
    }

    public Runnable runnable = new Runnable() {
        public void run() {
            settings = new SettingsActivity(getApplicationContext());

            if (!settings.getBool("FirstTime")) {
                settings.setBool("FirstTime", true);

                settings.putString("SettingsUnits", "auto");
                settings.putString("SettingsLanguage", "en");
                settings.putBoolean("SettingsRefresh", true);
                settings.putString("SettingsDuration", "auto");
                settings.putString("SettingsLatitude", "auto");
                settings.putString("SettingsLongitude", "auto");

                settings.setBool("Test", true);
            } else {
            }
        }
    };
```
